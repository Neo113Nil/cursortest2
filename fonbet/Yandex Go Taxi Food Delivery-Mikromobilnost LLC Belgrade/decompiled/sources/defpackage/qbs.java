package defpackage;

import android.content.Intent;
import android.content.res.Configuration;
import androidx.fragment.app.FragmentActivity;
import com.yandex.go.styling.interactor.b;

/* loaded from: classes.dex */
public final /* synthetic */ class qbs implements e9e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qbs(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.e9e
    public final void accept(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((FragmentActivity) obj2).lambda$init$1((Configuration) obj);
                break;
            case 1:
                ((FragmentActivity) obj2).lambda$init$2((Intent) obj);
                break;
            default:
                m3x0 m3x0Var = (m3x0) ((b) obj2).f.get();
                m3x0Var.getClass();
                qv10.B((((Configuration) obj).uiMode & 48) == 32, m3x0Var.a, null);
                break;
        }
    }
}
