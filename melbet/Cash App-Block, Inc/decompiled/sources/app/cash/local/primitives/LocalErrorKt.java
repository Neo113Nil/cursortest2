package app.cash.local.primitives;

import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.cash.local.client.v1.CreateOrderResponse;
import com.squareup.protos.cash.local.client.v1.LocalErrorResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.text.StringsKt;
import okio.ByteString;

/* loaded from: classes3.dex */
public abstract class LocalErrorKt {
    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewDependentControls.deepLinkSpecs;
    }

    public static final LocalErrorResponse toErrorResponse(com.squareup.protos.cash.local.client.v1.LocalErrorResponse localErrorResponse, CreateOrderResponse.ErrorResponse errorResponse) {
        ArrayList arrayList;
        List list;
        if (errorResponse == null || (list = errorResponse.errors) == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                String str = ((CreateOrderResponse.ErrorResponse.Error) obj).message;
                if (str != null && !StringsKt.isBlank(str)) {
                    arrayList2.add(obj);
                }
            }
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                CreateOrderResponse.ErrorResponse.Error error = (CreateOrderResponse.ErrorResponse.Error) it.next();
                arrayList.add(new LocalErrorResponse.Error(error.message, error.f1304type, null, null, null, null, ByteString.EMPTY));
            }
        }
        if (localErrorResponse == null) {
            if (arrayList == null) {
                return null;
            }
            return new LocalErrorResponse(arrayList);
        }
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        createListBuilder.addAll(localErrorResponse.errors);
        if (arrayList != null) {
            createListBuilder.addAll(arrayList);
        }
        return new LocalErrorResponse(CollectionsKt__CollectionsJVMKt.build(createListBuilder));
    }
}
