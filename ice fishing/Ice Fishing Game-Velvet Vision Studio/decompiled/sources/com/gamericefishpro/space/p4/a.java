package com.gamericefishpro.space.p4;

import com.gamericefishpro.space.ei.l;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends l implements Function1 {
    public static final a d = new a(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String strValueOf;
        Map.Entry entry = (Map.Entry) obj;
        Intrinsics.checkNotNullParameter(entry, "entry");
        Object value = entry.getValue();
        if (value instanceof byte[]) {
            byte[] bArr = (byte[]) value;
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            Intrinsics.checkNotNullParameter(", ", "separator");
            Intrinsics.checkNotNullParameter("[", "prefix");
            Intrinsics.checkNotNullParameter("]", "postfix");
            Intrinsics.checkNotNullParameter("...", "truncated");
            StringBuilder buffer = new StringBuilder();
            Intrinsics.checkNotNullParameter(bArr, "<this>");
            Intrinsics.checkNotNullParameter(buffer, "buffer");
            Intrinsics.checkNotNullParameter(", ", "separator");
            Intrinsics.checkNotNullParameter("[", "prefix");
            Intrinsics.checkNotNullParameter("]", "postfix");
            Intrinsics.checkNotNullParameter("...", "truncated");
            buffer.append((CharSequence) "[");
            int i = 0;
            for (byte b : bArr) {
                i++;
                if (i > 1) {
                    buffer.append((CharSequence) ", ");
                }
                buffer.append((CharSequence) String.valueOf((int) b));
            }
            buffer.append((CharSequence) "]");
            strValueOf = buffer.toString();
        } else {
            strValueOf = String.valueOf(entry.getValue());
        }
        return com.gamericefishpro.space.m5.a.j(new StringBuilder("  "), ((d) entry.getKey()).a, " = ", strValueOf);
    }
}
