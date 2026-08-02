package defpackage;

import android.util.Log;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import com.google.firebase.sessions.a;
import com.yandex.div.evaluable.IntegerOverflow;
import java.io.FileNotFoundException;
import java.security.GeneralSecurityException;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final /* synthetic */ class yhl implements r131, sty, zol, bx60, e1d, mi2, iy60, kfo {
    public final /* synthetic */ int a;

    public /* synthetic */ yhl(int i) {
        this.a = i;
    }

    public static /* synthetic */ void a(Object obj, Object obj2, Object obj3) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IntegerOverflow(sb.toString());
    }

    public static /* synthetic */ void d(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void e(Object obj, String str, Throwable th) {
        throw new SecurityException(str + obj, th);
    }

    public static /* synthetic */ void f(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void g(Object obj, String str) {
        throw new GeneralSecurityException(str + obj);
    }

    public static /* synthetic */ void h(Object obj, String str) {
        throw new FileNotFoundException(str + obj);
    }

    @Override // defpackage.sty
    public boolean b(List list) {
        return list.size() >= 1;
    }

    @Override // defpackage.mi2
    public void c(ki2 ki2Var) {
    }

    @Override // defpackage.e1d
    public Object k(yuf0 yuf0Var) {
        hcr lambda$getComponents$0;
        a components$lambda$0;
        ocr components$lambda$1;
        switch (this.a) {
            case 13:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 14:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 15:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            case 16:
                j3y j3yVar = ExecutorsRegistrar.a;
                return UiExecutor.INSTANCE;
            case 25:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(yuf0Var);
                return lambda$getComponents$0;
            case 28:
                components$lambda$0 = FirebaseSessionsRegistrar.getComponents$lambda$0(yuf0Var);
                return components$lambda$0;
            default:
                components$lambda$1 = FirebaseSessionsRegistrar.getComponents$lambda$1(yuf0Var);
                return components$lambda$1;
        }
    }

    @Override // defpackage.r131
    public boolean l(Object obj) {
        Long l = (Long) obj;
        switch (this.a) {
            case 0:
                if (l.longValue() >= 0) {
                    break;
                }
                break;
            case 1:
                if (l.longValue() > 0) {
                    break;
                }
                break;
            case 2:
                if (l.longValue() >= 0) {
                    break;
                }
                break;
            case 3:
            case 4:
            default:
                long longValue = l.longValue();
                if (longValue > 0 && longValue <= 100) {
                    break;
                }
                break;
            case 5:
                if (l.longValue() >= 0) {
                    break;
                }
                break;
            case 6:
                if (l.longValue() >= 0) {
                    break;
                }
                break;
        }
        return true;
    }

    @Override // defpackage.bx60
    public n751 onApplyWindowInsets(View view, n751 n751Var) {
        n751 lambda$new$1;
        lambda$new$1 = DrawerLayout.lambda$new$1(view, n751Var);
        return lambda$new$1;
    }

    @Override // defpackage.iy60
    public void onFailure(Exception exc) {
        Log.e("FirebaseCrashlytics", "Error fetching settings.", exc);
    }
}
