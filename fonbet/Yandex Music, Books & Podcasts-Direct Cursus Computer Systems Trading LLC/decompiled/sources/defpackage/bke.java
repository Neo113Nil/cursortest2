package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import kotlin.jvm.functions.Function0;
import kotlin.text.c;
import ru.yandex.music.R;

/* loaded from: classes6.dex */
public final class bke extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ cke s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bke(cke ckeVar, int i) {
        super(0);
        this.r = i;
        this.s = ckeVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:3|4|5|(2:7|(12:9|10|11|(1:13)|14|15|16|(1:18)(1:(1:26)(2:27|28))|19|(1:21)|22|23))|34|10|11|(0)|14|15|16|(0)(0)|19|(0)|22|23) */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ae, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ba, code lost:
    
        r3 = defpackage.z7o.b;
        r2 = new defpackage.t7o(r2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b0  */
    /* JADX WARN: Type inference failed for: r5v3, types: [t7o] */
    @Override // kotlin.jvm.functions.Function0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        String str;
        Object t7oVar;
        String t7oVar2;
        Object t7oVar3;
        boolean z;
        String str2;
        int i = this.r;
        str = "";
        cke ckeVar = this.s;
        switch (i) {
            case 0:
                try {
                    r7o r7oVar = z7o.b;
                    Context context = ckeVar.a;
                    PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                    String packageName = context.getPackageName();
                    packageName.getClass();
                    String str3 = packageInfo.versionName;
                    if (str3 != null) {
                        str = str3;
                    }
                    t7oVar = new wt0(cke.a(ckeVar, packageInfo), packageName, str);
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                }
                Object wt0Var = new wt0(0L, "UndefinedApp", "Undefined");
                if (t7oVar instanceof t7o) {
                    t7oVar = wt0Var;
                }
                return (wt0) t7oVar;
            default:
                StringBuilder sb = new StringBuilder("ru.yandex.video.m3/3.8.1.19731 (");
                try {
                    r7o r7oVar3 = z7o.b;
                    str2 = Build.MODEL;
                } catch (Throwable th2) {
                    r7o r7oVar4 = z7o.b;
                    t7oVar2 = new t7o(th2);
                }
                if (str2 != null) {
                    String str4 = Build.MANUFACTURER;
                    str4.getClass();
                    if (c.v(str2, str4, false)) {
                        t7oVar2 = c.k(str2);
                        sb.append(t7oVar2 instanceof t7o ? "" : t7oVar2);
                        sb.append("; Android ");
                        sb.append(Build.VERSION.RELEASE);
                        sb.append(") ");
                        sb.append(ckeVar.b().a);
                        sb.append('/');
                        sb.append(ckeVar.b().b);
                        sb.append('.');
                        sb.append(ckeVar.b().c);
                        sb.append(' ');
                        z = ckeVar.a.getResources().getBoolean(R.bool.videoPlayer_isTablet);
                        if (!z) {
                            t7oVar3 = "Tablet";
                        } else {
                            if (z) {
                                throw new x7j();
                            }
                            t7oVar3 = "Mobile";
                        }
                        sb.append((String) (t7oVar3 instanceof t7o ? "Mobile" : t7oVar3));
                        return sb.toString();
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                String str5 = Build.MANUFACTURER;
                str5.getClass();
                sb2.append(c.k(str5));
                sb2.append(' ');
                str2.getClass();
                sb2.append(c.k(str2));
                t7oVar2 = sb2.toString();
                sb.append(t7oVar2 instanceof t7o ? "" : t7oVar2);
                sb.append("; Android ");
                sb.append(Build.VERSION.RELEASE);
                sb.append(") ");
                sb.append(ckeVar.b().a);
                sb.append('/');
                sb.append(ckeVar.b().b);
                sb.append('.');
                sb.append(ckeVar.b().c);
                sb.append(' ');
                z = ckeVar.a.getResources().getBoolean(R.bool.videoPlayer_isTablet);
                if (!z) {
                }
                sb.append((String) (t7oVar3 instanceof t7o ? "Mobile" : t7oVar3));
                return sb.toString();
        }
    }
}
