package app.cash.zipline.internal.bridge;

import bo.app.yf$$ExternalSyntheticLambda10;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes3.dex */
public abstract class ZiplineServiceAdapterKt {
    public static final String descriptorName(SerialDescriptor serialDescriptor, LinkedHashSet linkedHashSet) {
        if (!linkedHashSet.add(serialDescriptor)) {
            return "[CIRCULAR]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(serialDescriptor.getSerialName());
        if (serialDescriptor.getElementsCount() > 0) {
            sb.append('<');
            IntRange until = RangesKt___RangesKt.until(0, serialDescriptor.getElementsCount());
            int i = until.first;
            int i2 = until.last;
            if (i <= i2) {
                while (true) {
                    sb.append(descriptorName(serialDescriptor.getElementDescriptor(i), linkedHashSet));
                    if (i < i2) {
                        sb.append(',');
                    }
                    if (i == i2) {
                        break;
                    }
                    i++;
                }
            }
            sb.append('>');
        }
        return sb.toString();
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewFamilyHomeForNewDependent.deepLinkSpecs;
    }

    public static final String serialName(String str, List list) {
        list.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        CollectionsKt.joinTo$default(list, sb, ",", "<", ">", new yf$$ExternalSyntheticLambda10(14), 48);
        return sb.toString();
    }
}
