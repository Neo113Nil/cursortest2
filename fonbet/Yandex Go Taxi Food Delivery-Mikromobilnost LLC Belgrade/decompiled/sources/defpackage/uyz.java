package defpackage;

import android.content.Context;
import com.yandex.go.payments.paymentlist.ui.IconType;
import java.util.function.Function;

/* loaded from: classes12.dex */
public final /* synthetic */ class uyz implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ IconType b;

    public /* synthetic */ uyz(IconType iconType, int i) {
        this.a = i;
        this.b = iconType;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Context context = (Context) obj;
        switch (this.a) {
        }
        return vng.t(this.b.getResourceId(), context);
    }
}
