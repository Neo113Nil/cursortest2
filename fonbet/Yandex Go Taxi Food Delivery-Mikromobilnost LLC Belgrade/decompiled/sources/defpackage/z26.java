package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.yandex.messaging.domain.poll.PollMessageDraft;
import ru.yandex.taxi.activity.g;

/* loaded from: classes6.dex */
public final class z26 {
    public final y50 a;
    public final Activity b;
    public final g c;

    public z26(y50 y50Var, Activity activity, g gVar) {
        this.a = y50Var;
        this.b = activity;
        this.c = gVar;
    }

    public final void a() {
        y50 y50Var = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.fromParts("package", this.b.getPackageName(), null));
            a60 a60Var = (a60) y50Var;
            a60Var.getClass();
            try {
                a60Var.e(141, intent);
            } catch (ActivityNotFoundException | Exception unused) {
            }
        } catch (Exception unused2) {
            Intent intent2 = new Intent("android.settings.SETTINGS");
            a60 a60Var2 = (a60) y50Var;
            a60Var2.getClass();
            a60Var2.e(141, intent2);
        }
    }

    public final void b() {
        y50 y50Var = this.a;
        try {
            try {
                try {
                    Intent intent = new Intent("android.settings.BLUETOOTH_SETTINGS");
                    a60 a60Var = (a60) y50Var;
                    a60Var.getClass();
                    a60Var.e(139, intent);
                } catch (Exception unused) {
                    Intent intent2 = new Intent("android.settings.SETTINGS");
                    a60 a60Var2 = (a60) y50Var;
                    a60Var2.getClass();
                    a60Var2.e(141, intent2);
                }
            } catch (ActivityNotFoundException unused2) {
            }
        } catch (Exception unused3) {
            Intent intent3 = new Intent("android.settings.WIRELESS_SETTINGS");
            a60 a60Var3 = (a60) y50Var;
            a60Var3.getClass();
            a60Var3.e(PollMessageDraft.MAX_ANSWER_LENGTH, intent3);
        }
    }

    public final void c() {
        try {
            Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
            a60 a60Var = (a60) this.a;
            a60Var.getClass();
            try {
                a60Var.e(113, intent);
            } catch (ActivityNotFoundException unused) {
            }
        } catch (Exception e) {
            jst.e.k(e, "Can't open location settings");
        }
    }
}
