package app.cash.zipline;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class Call {
    public final List args;
    public final String encodedCall;
    public final ZiplineFunction function;
    public final ZiplineService service;
    public final List serviceNames;

    public Call(String str, ZiplineService ziplineService, ZiplineFunction ziplineFunction, List list, String str2, ArrayList arrayList) {
        str.getClass();
        ziplineService.getClass();
        list.getClass();
        arrayList.getClass();
        this.service = ziplineService;
        this.function = ziplineFunction;
        this.args = list;
        this.encodedCall = str2;
        this.serviceNames = CollectionsKt.toList(arrayList);
    }

    public final String toString() {
        String signature = this.function.getSignature();
        StringBuilder sb = new StringBuilder("Call(receiver=");
        sb.append(this.service);
        sb.append(", function=");
        sb.append(signature);
        sb.append(", args=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.args, ")");
    }
}
