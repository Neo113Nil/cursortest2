package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import androidx.core.app.f0;
import androidx.core.app.z;
import androidx.core.graphics.drawable.IconCompat;
import androidx.media3.session.MediaSessionService;
import androidx.media3.session.a;
import androidx.media3.session.c;
import androidx.media3.session.i;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public class ko7 implements koh {
    public final Context a;
    public final jo7 b;
    public final String c;
    public final int d;
    public final NotificationManager e;
    public a f;
    public int g;

    public ko7(Context context, jo7 jo7Var, String str, int i) {
        this.a = context;
        this.b = jo7Var;
        this.c = str;
        this.d = i;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        vq1.B(notificationManager);
        this.e = notificationManager;
        this.g = R.drawable.media3_notification_small_icon;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j4x a(mzb mzbVar, yde ydeVar, j4x j4xVar, c cVar) {
        ko7 ko7Var;
        int i;
        i iVar;
        int i2;
        i8l i8lVar;
        i iVar2;
        rwh rwhVar;
        int i3;
        long j;
        Context context;
        char c;
        int i4 = dvt.a;
        Context context2 = this.a;
        int i5 = 0;
        String str = this.c;
        if (i4 >= 26) {
            NotificationManager notificationManager = this.e;
            if (notificationManager.getNotificationChannel(str) == null) {
                NotificationChannel notificationChannel = new NotificationChannel(str, context2.getString(this.d), 2);
                if (i4 <= 27) {
                    notificationChannel.setShowBadge(false);
                }
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
        hld.w(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i6 = 0;
        for (int i7 = 0; i7 < ydeVar.size(); i7++) {
            tb5 tb5Var = (tb5) ydeVar.get(i7);
            alp alpVar = tb5Var.a;
            if (alpVar != null && alpVar.a == 0 && tb5Var.i) {
                tb5 tb5Var2 = (tb5) ydeVar.get(i7);
                tb5Var2.getClass();
                int i8 = i6 + 1;
                int e = pde.e(objArr.length, i8);
                if (e > objArr.length) {
                    objArr = Arrays.copyOf(objArr, e);
                }
                objArr[i6] = tb5Var2;
                i6 = i8;
            }
        }
        i8l a = mzbVar.a();
        i iVar3 = mzbVar.a;
        f0 f0Var = new f0(context2, str);
        int c2 = this.b.c(mzbVar);
        rwh rwhVar2 = new rwh(mzbVar);
        qsn b = b(mzbVar, a.f0(), yde.t(i6, objArr), !dvt.i0(a, iVar3.p));
        int[] iArr = new int[3];
        int[] iArr2 = new int[3];
        int i9 = 1;
        Arrays.fill(iArr, -1);
        Arrays.fill(iArr2, -1);
        int i10 = 0;
        while (true) {
            if (i5 >= b.d) {
                break;
            }
            tb5 tb5Var3 = (tb5) b.get(i5);
            alp alpVar2 = tb5Var3.a;
            int i11 = tb5Var3.b;
            qsn qsnVar = b;
            CharSequence charSequence = tb5Var3.f;
            int i12 = i5;
            int i13 = tb5Var3.d;
            int[] iArr3 = iArr2;
            sde sdeVar = tb5Var3.h;
            if (alpVar2 != null) {
                MediaSessionService mediaSessionService = (MediaSessionService) j4xVar.c;
                i2 = c2;
                vq1.v(alpVar2.a == 0 ? i9 : 0);
                alpVar2.getClass();
                IconCompat b2 = IconCompat.b(mediaSessionService, i13);
                String str2 = alpVar2.b;
                Bundle bundle = alpVar2.c;
                i8lVar = a;
                rwhVar = rwhVar2;
                Intent intent = new Intent("androidx.media3.session.CUSTOM_NOTIFICATION_ACTION");
                intent.setData(iVar3.b);
                iVar2 = iVar3;
                intent.setComponent(new ComponentName(mediaSessionService, mediaSessionService.getClass()));
                intent.putExtra("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION", str2);
                intent.putExtra("androidx.media3.session.EXTRAS_KEY_CUSTOM_NOTIFICATION_ACTION_EXTRAS", bundle);
                int i14 = j4xVar.b + 1;
                j4xVar.b = i14;
                f0Var.b.add(new z(b2, charSequence, PendingIntent.getService(mediaSessionService, i14, intent, (dvt.a < 23 ? 0 : 67108864) | 134217728)));
                context = context2;
                c = 26;
            } else {
                i2 = c2;
                i8lVar = a;
                iVar2 = iVar3;
                rwhVar = rwhVar2;
                vq1.A(i11 != -1 ? i9 : 0);
                IconCompat b3 = IconCompat.b(context2, i13);
                long j2 = i11;
                MediaSessionService mediaSessionService2 = (MediaSessionService) j4xVar.c;
                if (j2 == 8 || j2 == 9) {
                    i3 = 87;
                } else if (j2 == 6 || j2 == 7) {
                    i3 = 88;
                } else {
                    if (j2 == 3) {
                        j = 1;
                        i3 = 86;
                    } else if (j2 == 12) {
                        i3 = 90;
                    } else if (j2 == 11) {
                        i3 = 89;
                    } else if (j2 == 1) {
                        i3 = 85;
                    } else {
                        j = 1;
                        i3 = 0;
                    }
                    Intent h = j4xVar.h(mzbVar, i3);
                    int i15 = dvt.a;
                    context = context2;
                    c = 26;
                    f0Var.b.add(new z(b3, charSequence, (i15 >= 26 || j2 != j || mzbVar.a().g0()) ? PendingIntent.getService(mediaSessionService2, i3, h, i15 < 23 ? 67108864 : 0) : PendingIntent.getForegroundService(mediaSessionService2, i3, h, 67108864)));
                }
                j = 1;
                Intent h2 = j4xVar.h(mzbVar, i3);
                int i152 = dvt.a;
                context = context2;
                c = 26;
                if (i152 >= 26) {
                }
                f0Var.b.add(new z(b3, charSequence, (i152 >= 26 || j2 != j || mzbVar.a().g0()) ? PendingIntent.getService(mediaSessionService2, i3, h2, i152 < 23 ? 67108864 : 0) : PendingIntent.getForegroundService(mediaSessionService2, i3, h2, 67108864)));
            }
            int i16 = tb5Var3.g.getInt("androidx.media3.session.command.COMPACT_VIEW_INDEX", -1);
            if (i16 >= 0 && i16 < 3) {
                iArr[i16] = i12;
                i10 = i9;
            } else if (sdeVar.a(0) == 2) {
                iArr3[0] = i12;
            } else {
                int i17 = i9;
                if (sdeVar.a(0) == i17) {
                    iArr3[i17] = i12;
                } else {
                    if (sdeVar.a(0) == 3) {
                        iArr3[2] = i12;
                    }
                    i5 = i12 + 1;
                    b = qsnVar;
                    iArr2 = iArr3;
                    c2 = i2;
                    a = i8lVar;
                    rwhVar2 = rwhVar;
                    iVar3 = iVar2;
                    context2 = context;
                    i9 = 1;
                }
            }
            i5 = i12 + 1;
            b = qsnVar;
            iArr2 = iArr3;
            c2 = i2;
            a = i8lVar;
            rwhVar2 = rwhVar;
            iVar3 = iVar2;
            context2 = context;
            i9 = 1;
        }
        int i18 = c2;
        i8l i8lVar2 = a;
        i iVar4 = iVar3;
        rwh rwhVar3 = rwhVar2;
        int[] iArr4 = iArr2;
        if (i10 == 0) {
            int i19 = 0;
            int i20 = 0;
            for (int i21 = 3; i19 < i21; i21 = 3) {
                int i22 = iArr4[i19];
                if (i22 != -1) {
                    iArr[i20] = i22;
                    i20++;
                }
                i19++;
            }
        }
        int i23 = 0;
        while (true) {
            if (i23 >= 3) {
                break;
            }
            if (iArr[i23] == -1) {
                iArr = Arrays.copyOf(iArr, i23);
                break;
            }
            i23++;
        }
        rwhVar3.c = iArr;
        if (i8lVar2.V0(18)) {
            hoh H0 = i8lVar2.H0();
            f0Var.e = f0.c(H0.a);
            f0Var.d(H0.b);
            iVar = iVar4;
            lcg e0 = iVar.m.e0(H0);
            ko7Var = this;
            if (e0 != null) {
                a aVar = ko7Var.f;
                if (aVar != null) {
                    aVar.d = true;
                }
                if (e0.isDone()) {
                    try {
                        f0Var.h((Bitmap) leu.O(e0));
                    } catch (CancellationException | ExecutionException e2) {
                        vq1.n0("NotificationProvider", "Failed to load bitmap: " + e2.getMessage());
                    }
                } else {
                    i = i18;
                    a aVar2 = new a(i, f0Var, cVar);
                    ko7Var.f = aVar2;
                    Handler handler = iVar.l;
                    Objects.requireNonNull(handler);
                    e0.a(new pv7(e0, aVar2, false, 9), new dk7(handler, 0));
                }
            }
            i = i18;
        } else {
            ko7Var = this;
            i = i18;
            iVar = iVar4;
        }
        long currentTimeMillis = (!i8lVar2.e() || i8lVar2.i() || i8lVar2.W0() || i8lVar2.m().a != 1.0f) ? -9223372036854775807L : System.currentTimeMillis() - i8lVar2.s0();
        boolean z = currentTimeMillis != -9223372036854775807L;
        if (!z) {
            currentTimeMillis = 0;
        }
        f0Var.K.when = currentTimeMillis;
        f0Var.l = z;
        f0Var.m = z;
        int i24 = dvt.a;
        if (i24 >= 31) {
            f0Var.I = 1;
        }
        f0Var.g = iVar.u;
        f0Var.K.deleteIntent = PendingIntent.getService((MediaSessionService) j4xVar.c, 86, j4xVar.h(mzbVar, 86).putExtra("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", true), i24 >= 23 ? 67108864 : 0);
        f0Var.g(8, true);
        f0Var.K.icon = ko7Var.g;
        f0Var.k(rwhVar3);
        f0Var.B = 1;
        f0Var.g(2, false);
        f0Var.s = "media3_group_key";
        return new j4x(i, f0Var.b());
    }

    public qsn b(mzb mzbVar, d8l d8lVar, yde ydeVar, boolean z) {
        qsn e = tb5.e(ydeVar, true, true);
        boolean a = tb5.a(e, 2);
        boolean a2 = tb5.a(e, 3);
        tde tdeVar = new tde(4);
        Context context = this.a;
        int i = 0;
        if (a) {
            tdeVar.a(((tb5) e.get(0)).b(sde.b(2)));
            i = 1;
        } else {
            if (d8lVar.a.a(7, 6)) {
                sb5 sb5Var = new sb5(57413);
                sb5Var.b(6);
                sb5Var.f = context.getString(R.string.media3_controls_seek_to_previous_description);
                tdeVar.a(sb5Var.a());
            }
        }
        if (d8lVar.a(1)) {
            if (z) {
                sb5 sb5Var2 = new sb5(57396);
                sb5Var2.b(1);
                sb5Var2.f = context.getString(R.string.media3_controls_pause_description);
                tdeVar.a(sb5Var2.a());
            } else {
                sb5 sb5Var3 = new sb5(57399);
                sb5Var3.b(1);
                sb5Var3.f = context.getString(R.string.media3_controls_play_description);
                tdeVar.a(sb5Var3.a());
            }
        }
        if (a2) {
            tdeVar.a(((tb5) e.get(i)).b(sde.b(3)));
            i++;
        } else {
            if (d8lVar.a.a(9, 8)) {
                sb5 sb5Var4 = new sb5(57412);
                sb5Var4.b(8);
                sb5Var4.f = context.getString(R.string.media3_controls_seek_to_next_description);
                tdeVar.a(sb5Var4.a());
            }
        }
        while (i < e.d) {
            tdeVar.a(((tb5) e.get(i)).b(sde.b(6)));
            i++;
        }
        return tdeVar.f();
    }
}
