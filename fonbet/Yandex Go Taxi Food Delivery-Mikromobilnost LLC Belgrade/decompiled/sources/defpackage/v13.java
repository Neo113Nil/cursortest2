package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Map;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes2.dex */
public final class v13 implements dw {
    public final /* synthetic */ int a;
    public final Context b;

    public /* synthetic */ v13(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        kr krVar2;
        kr krVar3;
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                Map map = n6uVar.e;
                pxl pxlVar = n6uVar.b;
                n530 n530Var = n6uVar.c;
                t13 t13Var = (t13) krVar;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(t13Var.a));
                    intent.setFlags(intent.getFlags() + SelfTester_JCP.IMITA);
                    context.startActivity(intent);
                    krVar2 = t13Var.b;
                } catch (ActivityNotFoundException | Exception unused) {
                    krVar2 = t13Var.b;
                } catch (Throwable th) {
                    n530Var.b(t13Var.b, pxlVar, map);
                    throw th;
                }
                n530Var.b(krVar2, pxlVar, map);
                return;
            default:
                Map map2 = n6uVar.e;
                pxl pxlVar2 = n6uVar.b;
                n530 n530Var2 = n6uVar.c;
                u13 u13Var = (u13) krVar;
                try {
                    try {
                        Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(u13Var.a));
                        intent2.setFlags(intent2.getFlags() + SelfTester_JCP.IMITA);
                        context.startActivity(intent2);
                    } catch (ActivityNotFoundException unused2) {
                        krVar3 = u13Var.b;
                    } catch (Exception e) {
                        h5z0.a.f(e, "Error to start activity with applink %s", u13Var.a);
                    }
                    krVar3 = u13Var.b;
                    n530Var2.b(krVar3, pxlVar2, map2);
                    return;
                } catch (Throwable th2) {
                    n530Var2.b(u13Var.b, pxlVar2, map2);
                    throw th2;
                }
        }
    }
}
