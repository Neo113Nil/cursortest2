package com.yandex.passport.internal.push;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.RingtoneManager;
import android.net.Uri;
import android.widget.RemoteViews;
import com.yandex.passport.R;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.xz0;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class p {
    public final Context a;
    public final com.yandex.passport.common.network.n b;
    public final f0 c;

    public p(Context context, com.yandex.passport.common.network.n nVar, f0 f0Var) {
        context.getClass();
        nVar.getClass();
        f0Var.getClass();
        this.a = context;
        this.b = nVar;
        this.c = f0Var;
    }

    public static void b(RemoteViews remoteViews, List list) {
        remoteViews.setImageViewBitmap(R.id.picture_1, (Bitmap) list.get(0));
        remoteViews.setImageViewBitmap(R.id.picture_2, (Bitmap) list.get(1));
        remoteViews.setImageViewBitmap(R.id.picture_3, (Bitmap) list.get(2));
        remoteViews.setImageViewBitmap(R.id.picture_4, (Bitmap) list.get(3));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|(1:(9:10|11|12|13|14|(1:16)|17|18|(4:20|21|22|(1:24)(7:26|13|14|(0)|17|18|(2:27|(1:29)(11:30|(4:33|(3:35|36|37)(1:39)|38|31)|40|41|(1:43)|44|45|46|(1:57)(1:50)|51|(2:53|54)(2:55|56)))(0)))(0))(2:63|64))(4:65|66|18|(0)(0))))|69|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x004a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x004b, code lost:
    
        r20 = r6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ab A[Catch: all -> 0x00af, TryCatch #1 {all -> 0x00af, blocks: (B:14:0x00a7, B:16:0x00ab, B:22:0x0082, B:27:0x00b7, B:30:0x00c3, B:31:0x00e1, B:33:0x00e7, B:36:0x00f4, B:41:0x00f8, B:44:0x010b), top: B:13:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0076 A[Catch: all -> 0x004a, TRY_LEAVE, TryCatch #0 {all -> 0x004a, blocks: (B:11:0x003e, B:18:0x0070, B:20:0x0076, B:66:0x0058), top: B:7:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b7 A[Catch: all -> 0x00af, TryCatch #1 {all -> 0x00af, blocks: (B:14:0x00a7, B:16:0x00ab, B:22:0x0082, B:27:0x00b7, B:30:0x00c3, B:31:0x00e1, B:33:0x00e7, B:36:0x00f4, B:41:0x00f8, B:44:0x010b), top: B:13:0x00a7 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v16, types: [androidx.core.app.f0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a5 -> B:13:0x00a7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(c0 c0Var, com.yandex.passport.common.core.f fVar, cg6 cg6Var) {
        o oVar;
        p pVar;
        int i;
        t7o t7oVar;
        Throwable a;
        String str;
        c0 c0Var2;
        com.yandex.passport.common.core.f fVar2;
        p pVar2;
        Iterator it;
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        int i5;
        Bitmap bitmap;
        if (cg6Var instanceof o) {
            oVar = (o) cg6Var;
            int i6 = oVar.u;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                oVar.u = i6 - Integer.MIN_VALUE;
                pVar = this;
                Object obj = oVar.s;
                nm6 nm6Var = nm6.a;
                i = oVar.u;
                String str2 = null;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    c0Var2 = c0Var;
                    ArrayList arrayList2 = c0Var2.h;
                    ArrayList arrayList3 = new ArrayList();
                    fVar2 = fVar;
                    pVar2 = pVar;
                    it = arrayList2.iterator();
                    arrayList = arrayList3;
                    i2 = 0;
                    i3 = 0;
                    i4 = 0;
                    i5 = 0;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = oVar.r;
                    i3 = oVar.q;
                    i4 = oVar.p;
                    i5 = oVar.o;
                    it = oVar.n;
                    Collection collection = oVar.m;
                    p pVar3 = oVar.l;
                    com.yandex.passport.common.core.f fVar3 = oVar.k;
                    c0 c0Var3 = oVar.j;
                    qgg.h0(obj);
                    arrayList = collection;
                    fVar2 = fVar3;
                    pVar2 = pVar3;
                    String str3 = null;
                    try {
                        bitmap = (Bitmap) obj;
                        if (bitmap != null) {
                            arrayList.add(bitmap);
                        }
                        str2 = str3;
                        c0Var2 = c0Var3;
                    } catch (Throwable th) {
                        th = th;
                        r7o r7oVar2 = z7o.b;
                        t7oVar = new t7o(th);
                        a = z7o.a(t7oVar);
                        if (a == null) {
                        }
                        str = str3;
                        if (!(t7oVar instanceof t7o)) {
                        }
                    }
                    if (it.hasNext()) {
                        int intValue = ((Number) it.next()).intValue();
                        str3 = str2;
                        com.yandex.passport.common.network.n nVar = pVar2.b;
                        com.yandex.passport.common.core.b bVar = fVar2.a;
                        oVar.j = c0Var2;
                        oVar.k = fVar2;
                        oVar.l = pVar2;
                        oVar.m = arrayList;
                        oVar.n = it;
                        oVar.o = i5;
                        oVar.p = i4;
                        oVar.q = i3;
                        oVar.r = i2;
                        oVar.u = 1;
                        Object R = nVar.R(bVar, intValue, oVar);
                        if (R == nm6Var) {
                            return nm6Var;
                        }
                        c0Var3 = c0Var2;
                        obj = R;
                        bitmap = (Bitmap) obj;
                        if (bitmap != null) {
                        }
                        str2 = str3;
                        c0Var2 = c0Var3;
                        if (it.hasNext()) {
                            str3 = str2;
                            ArrayList arrayList4 = arrayList;
                            if (arrayList4.size() != 4) {
                                return str3;
                            }
                            String str4 = c0Var2.l;
                            String str5 = c0Var2.g;
                            ArrayList arrayList5 = c0Var2.h;
                            String str6 = c0Var2.n;
                            pVar2.getClass();
                            List w = xz0.w(new String[]{str4, str6});
                            ArrayList arrayList6 = new ArrayList();
                            Iterator it2 = ((ArrayList) w).iterator();
                            while (it2.hasNext()) {
                                Object next = it2.next();
                                if (!StringsKt.U((String) next)) {
                                    arrayList6.add(next);
                                }
                            }
                            String X = CollectionsKt.X(arrayList6, ", ", null, null, null, 62);
                            if (X.length() == 0) {
                                X = "";
                            }
                            Context context = pVar2.a;
                            f0 f0Var = pVar2.c;
                            RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.passport_picture_notification);
                            b(remoteViews, arrayList4);
                            remoteViews.setOnClickPendingIntent(R.id.picture_1, f0Var.b(fVar2, c0Var2, new com.yandex.passport.sloth.data.c(((Number) arrayList5.get(0)).intValue())));
                            remoteViews.setOnClickPendingIntent(R.id.picture_2, f0Var.b(fVar2, c0Var2, new com.yandex.passport.sloth.data.c(((Number) arrayList5.get(1)).intValue())));
                            remoteViews.setOnClickPendingIntent(R.id.picture_3, f0Var.b(fVar2, c0Var2, new com.yandex.passport.sloth.data.c(((Number) arrayList5.get(2)).intValue())));
                            remoteViews.setOnClickPendingIntent(R.id.picture_4, f0Var.b(fVar2, c0Var2, new com.yandex.passport.sloth.data.c(((Number) arrayList5.get(3)).intValue())));
                            remoteViews.setOnClickPendingIntent(R.id.not_me, f0Var.b(fVar2, c0Var2, com.yandex.passport.sloth.data.e.a));
                            remoteViews.setOnClickPendingIntent(R.id.about_device, f0Var.b(fVar2, c0Var2, com.yandex.passport.sloth.data.d.a));
                            String str7 = str5 + '\n' + X;
                            remoteViews.setTextViewText(R.id.notification_title, str7);
                            Uri defaultUri = RingtoneManager.getDefaultUri(2);
                            ?? f0Var2 = new androidx.core.app.f0(context, context.getPackageName());
                            Notification notification = f0Var2.K;
                            f0Var2.k = 2;
                            notification.icon = R.drawable.passport_id_notification;
                            f0Var2.j(defaultUri);
                            f0Var2.g(16, true);
                            f0Var2.w = true;
                            f0Var2.x = true;
                            f0Var2.A = context.getColor(R.color.passport_logout_brand_background);
                            notification.when = c0Var2.q;
                            notification.deleteIntent = pVar2.c.c(pVar2.a, c0Var2.r, c0Var2.g, fVar2, c0Var2.c, c0Var2.b, c0Var2.d);
                            f0Var2.g = f0Var.a(c0Var2.r, f0Var.d(f0Var.e(fVar2, c0Var2.s, com.yandex.passport.sloth.data.h.c)));
                            f0Var2.e = androidx.core.app.f0.c(str5);
                            f0Var2.f = androidx.core.app.f0.c(context.getString(R.string.passport_notification_pictures_text));
                            Notification b = f0Var2.b();
                            b.getClass();
                            f0Var2.e = androidx.core.app.f0.c(str7);
                            f0Var2.f = androidx.core.app.f0.c(context.getString(R.string.passport_notification_pictures_text));
                            f0Var2.D = remoteViews;
                            f0Var2.C = b;
                            r7o r7oVar3 = z7o.b;
                            t7oVar = f0Var2;
                            a = z7o.a(t7oVar);
                            if (a == null && com.yandex.passport.common.logger.a.a.isEnabled()) {
                                str = str3;
                                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, str, "Something go wrong: " + a, 8);
                            } else {
                                str = str3;
                            }
                            return !(t7oVar instanceof t7o) ? str : t7oVar;
                        }
                    }
                }
            }
        }
        pVar = this;
        oVar = new o(pVar, cg6Var);
        Object obj2 = oVar.s;
        nm6 nm6Var2 = nm6.a;
        i = oVar.u;
        String str22 = null;
        if (i != 0) {
        }
    }
}
