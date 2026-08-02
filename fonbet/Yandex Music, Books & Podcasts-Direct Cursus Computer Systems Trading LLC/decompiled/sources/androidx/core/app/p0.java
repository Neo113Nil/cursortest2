package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import defpackage.cz0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class p0 {
    public final Context a;
    public final Notification.Builder b;
    public final f0 c;
    public final Bundle d;
    public final int e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [android.content.Context, android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r10v7 */
    public p0(f0 f0Var) {
        String str;
        String str2;
        int i;
        ArrayList arrayList;
        String str3;
        Bundle[] bundleArr;
        int i2;
        ArrayList arrayList2;
        Iterator it;
        ArrayList arrayList3;
        int i3;
        new ArrayList();
        this.d = new Bundle();
        this.c = f0Var;
        Context context = f0Var.a;
        ArrayList arrayList4 = f0Var.M;
        ArrayList arrayList5 = f0Var.c;
        ArrayList arrayList6 = f0Var.d;
        this.a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            this.b = u.c(context, f0Var.E);
        } else {
            this.b = new Notification.Builder(context);
        }
        Notification notification = f0Var.K;
        ?? r10 = 0;
        this.b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(f0Var.e).setContentText(f0Var.f).setContentInfo(f0Var.i).setContentIntent(f0Var.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(f0Var.j).setProgress(f0Var.p, f0Var.q, f0Var.r);
        Notification.Builder builder = this.b;
        IconCompat iconCompat = f0Var.h;
        builder.setLargeIcon(iconCompat == null ? null : iconCompat.h(context));
        this.b.setSubText(f0Var.o).setUsesChronometer(f0Var.m).setPriority(f0Var.k);
        Iterator it2 = f0Var.b.iterator();
        while (true) {
            str = "android.support.allowGeneratedReplies";
            str2 = "";
            if (!it2.hasNext()) {
                break;
            }
            z zVar = (z) it2.next();
            if (zVar.b == null && (i3 = zVar.f) != 0) {
                zVar.b = IconCompat.c(r10, "", i3);
            }
            IconCompat iconCompat2 = zVar.b;
            boolean z = zVar.d;
            Bundle bundle = zVar.a;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompat2 != 0 ? iconCompat2.h(r10) : r10, zVar.g, zVar.h);
            b1[] b1VarArr = zVar.c;
            if (b1VarArr != null) {
                int length = b1VarArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                it = it2;
                arrayList3 = arrayList5;
                int i4 = 0;
                while (i4 < b1VarArr.length) {
                    b1 b1Var = b1VarArr[i4];
                    int i5 = i4;
                    b1Var.getClass();
                    b1[] b1VarArr2 = b1VarArr;
                    RemoteInput.Builder addExtras = new RemoteInput.Builder("key_text_reply").setLabel(b1Var.a).setChoices(null).setAllowFreeFormInput(true).addExtras(b1Var.b);
                    RemoteInput[] remoteInputArr2 = remoteInputArr;
                    if (Build.VERSION.SDK_INT >= 26) {
                        Iterator it3 = b1Var.c.iterator();
                        while (it3.hasNext()) {
                            u.u(addExtras, (String) it3.next());
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        g.f(addExtras);
                    }
                    remoteInputArr2[i5] = addExtras.build();
                    i4 = i5 + 1;
                    b1VarArr = b1VarArr2;
                    remoteInputArr = remoteInputArr2;
                }
                RemoteInput[] remoteInputArr3 = remoteInputArr;
                for (int i6 = 0; i6 < length; i6++) {
                    builder2.addRemoteInput(remoteInputArr3[i6]);
                }
            } else {
                it = it2;
                arrayList3 = arrayList5;
            }
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            bundle2.putBoolean("android.support.allowGeneratedReplies", z);
            builder2.setAllowGeneratedReplies(z);
            bundle2.putInt("android.support.action.semanticAction", 0);
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 28) {
                x.e(builder2);
            }
            if (i7 >= 29) {
                g.e(builder2);
            }
            if (i7 >= 31) {
                o0.a(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", zVar.e);
            builder2.addExtras(bundle2);
            this.b.addAction(builder2.build());
            it2 = it;
            arrayList5 = arrayList3;
            r10 = 0;
        }
        ArrayList arrayList7 = arrayList5;
        Bundle bundle3 = f0Var.z;
        if (bundle3 != null) {
            this.d.putAll(bundle3);
        }
        this.b.setShowWhen(f0Var.l);
        this.b.setLocalOnly(f0Var.v);
        this.b.setGroup(f0Var.s);
        this.b.setSortKey(f0Var.u);
        this.b.setGroupSummary(f0Var.t);
        this.e = f0Var.H;
        this.b.setCategory(f0Var.y);
        this.b.setColor(f0Var.A);
        this.b.setVisibility(f0Var.B);
        this.b.setPublicVersion(f0Var.C);
        this.b.setSound(notification.sound, notification.audioAttributes);
        if (Build.VERSION.SDK_INT < 28) {
            if (arrayList7 == null) {
                arrayList2 = null;
            } else {
                arrayList2 = new ArrayList(arrayList7.size());
                Iterator it4 = arrayList7.iterator();
                while (it4.hasNext()) {
                    CharSequence charSequence = ((z0) it4.next()).a;
                    arrayList2.add(charSequence != null ? "name:" + ((Object) charSequence) : "");
                }
            }
            if (arrayList2 != null) {
                if (arrayList4 == null) {
                    arrayList4 = arrayList2;
                } else {
                    cz0 cz0Var = new cz0(arrayList4.size() + arrayList2.size());
                    cz0Var.addAll(arrayList2);
                    cz0Var.addAll(arrayList4);
                    arrayList4 = new ArrayList(cz0Var);
                }
            }
        }
        if (arrayList4 != null && !arrayList4.isEmpty()) {
            Iterator it5 = arrayList4.iterator();
            while (it5.hasNext()) {
                this.b.addPerson((String) it5.next());
            }
        }
        if (arrayList6.size() > 0) {
            if (f0Var.z == null) {
                f0Var.z = new Bundle();
            }
            Bundle bundle4 = f0Var.z.getBundle("android.car.EXTENSIONS");
            bundle4 = bundle4 == null ? new Bundle() : bundle4;
            Bundle bundle5 = new Bundle(bundle4);
            Bundle bundle6 = new Bundle();
            int i8 = 0;
            while (i8 < arrayList6.size()) {
                String num = Integer.toString(i8);
                z zVar2 = (z) arrayList6.get(i8);
                Bundle bundle7 = new Bundle();
                if (zVar2.b != null || (i2 = zVar2.f) == 0) {
                    arrayList = arrayList6;
                } else {
                    arrayList = arrayList6;
                    zVar2.b = IconCompat.c(null, str2, i2);
                }
                IconCompat iconCompat3 = zVar2.b;
                Bundle bundle8 = zVar2.a;
                int i9 = i8;
                bundle7.putInt("icon", iconCompat3 != null ? iconCompat3.d() : 0);
                bundle7.putCharSequence("title", zVar2.g);
                bundle7.putParcelable("actionIntent", zVar2.h);
                Bundle bundle9 = bundle8 != null ? new Bundle(bundle8) : new Bundle();
                bundle9.putBoolean(str, zVar2.d);
                bundle7.putBundle("extras", bundle9);
                b1[] b1VarArr3 = zVar2.c;
                if (b1VarArr3 == null) {
                    str3 = str2;
                    bundleArr = null;
                } else {
                    Bundle[] bundleArr2 = new Bundle[b1VarArr3.length];
                    str3 = str2;
                    int i10 = 0;
                    while (i10 < b1VarArr3.length) {
                        b1 b1Var2 = b1VarArr3[i10];
                        b1[] b1VarArr4 = b1VarArr3;
                        Bundle bundle10 = new Bundle();
                        b1Var2.getClass();
                        int i11 = i10;
                        bundle10.putString("resultKey", "key_text_reply");
                        String str4 = str;
                        bundle10.putCharSequence("label", b1Var2.a);
                        bundle10.putCharSequenceArray("choices", null);
                        bundle10.putBoolean("allowFreeFormInput", true);
                        bundle10.putBundle("extras", b1Var2.b);
                        HashSet hashSet = b1Var2.c;
                        if (!hashSet.isEmpty()) {
                            ArrayList<String> arrayList8 = new ArrayList<>(hashSet.size());
                            Iterator it6 = hashSet.iterator();
                            while (it6.hasNext()) {
                                arrayList8.add((String) it6.next());
                            }
                            bundle10.putStringArrayList("allowedDataTypes", arrayList8);
                        }
                        bundleArr2[i11] = bundle10;
                        i10 = i11 + 1;
                        b1VarArr3 = b1VarArr4;
                        str = str4;
                    }
                    bundleArr = bundleArr2;
                }
                String str5 = str;
                bundle7.putParcelableArray("remoteInputs", bundleArr);
                bundle7.putBoolean("showsUserInterface", zVar2.e);
                bundle7.putInt("semanticAction", 0);
                bundle6.putBundle(num, bundle7);
                i8 = i9 + 1;
                arrayList6 = arrayList;
                str2 = str3;
                str = str5;
            }
            bundle4.putBundle("invisible_actions", bundle6);
            bundle5.putBundle("invisible_actions", bundle6);
            if (f0Var.z == null) {
                f0Var.z = new Bundle();
            }
            f0Var.z.putBundle("android.car.EXTENSIONS", bundle4);
            this.d.putBundle("android.car.EXTENSIONS", bundle5);
        }
        this.b.setExtras(f0Var.z);
        this.b.setRemoteInputHistory(null);
        RemoteViews remoteViews = f0Var.D;
        if (remoteViews != null) {
            this.b.setCustomBigContentView(remoteViews);
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            u.v(this.b);
            u.y(this.b);
            u.z(this.b, f0Var.F);
            u.A(this.b, f0Var.G);
            u.x(this.b, f0Var.H);
            if (f0Var.x) {
                u.w(this.b, f0Var.w);
            }
            if (!TextUtils.isEmpty(f0Var.E)) {
                this.b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i12 >= 28) {
            Iterator it7 = arrayList7.iterator();
            while (it7.hasNext()) {
                z0 z0Var = (z0) it7.next();
                Notification.Builder builder3 = this.b;
                z0Var.getClass();
                x.a(builder3, x.f(z0Var));
            }
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 29) {
            g.c(this.b, f0Var.J);
            g.d(this.b);
        }
        if (i13 >= 31 && (i = f0Var.I) != 0) {
            o0.b(this.b, i);
        }
        if (f0Var.L) {
            if (this.c.t) {
                this.e = 2;
            } else {
                this.e = 1;
            }
            this.b.setVibrate(null);
            this.b.setSound(null);
            int i14 = notification.defaults & (-4);
            notification.defaults = i14;
            this.b.setDefaults(i14);
            if (i13 >= 26) {
                if (TextUtils.isEmpty(this.c.s)) {
                    this.b.setGroup("silent");
                }
                u.x(this.b, this.e);
            }
        }
    }
}
