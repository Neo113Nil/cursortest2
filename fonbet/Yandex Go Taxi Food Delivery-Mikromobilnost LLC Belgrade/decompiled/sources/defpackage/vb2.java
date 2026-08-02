package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import defpackage.scc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.b;

/* loaded from: classes10.dex */
public final class vb2 implements z910 {
    public static final vb2 a = new vb2();

    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        aa10 w;
        aa10 w2;
        aa10 w3;
        int size = list.size();
        if (size == 0) {
            w = kVar.w(0, 0, b.f(), new tls() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1$1
                @Override // defpackage.tls
                public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    return zy11.a;
                }
            });
            return w;
        }
        if (size == 1) {
            final o l0 = ((x910) list.get(0)).l0(j);
            w2 = kVar.w(l0.a, l0.b, b.f(), new tls() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1$2
                {
                    super(1);
                }

                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    o.a.o((o.a) obj, o.this, 0, 0);
                    return zy11.a;
                }
            });
            return w2;
        }
        final ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < size2; i3++) {
            o l02 = ((x910) list.get(i3)).l0(j);
            i = Math.max(i, l02.a);
            i2 = Math.max(i2, l02.b);
            arrayList.add(l02);
        }
        w3 = kVar.w(i, i2, b.f(), new tls() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$SimpleStack$1$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                o.a aVar = (o.a) obj;
                int f = scc.f(arrayList);
                if (f >= 0) {
                    int i4 = 0;
                    while (true) {
                        o.a.o(aVar, arrayList.get(i4), 0, 0);
                        if (i4 == f) {
                            break;
                        }
                        i4++;
                    }
                }
                return zy11.a;
            }
        });
        return w3;
    }
}
