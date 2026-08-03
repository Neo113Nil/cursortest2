package com.onesignal.notifications.internal.display.impl;

import ac.o;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import com.onesignal.notifications.internal.display.impl.b;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import na.e;
import org.json.JSONObject;
import pc.j;
import q8.f;
import x2.g;
import x2.i;
import x2.q;
import xc.h;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class d implements pa.c {
    private final f _applicationService;
    private final oa.d _dataController;
    private final pa.a _notificationDisplayBuilder;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends hc.c {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        int label;
        /* synthetic */ Object result;

        public a(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.createGrouplessSummaryNotification(null, null, 0, 0, this);
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends hc.c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public b(fc.d dVar) {
            super(dVar);
        }

        @Override // hc.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.createSummaryNotification(null, null, 0, this);
        }
    }

    public d(f fVar, oa.d dVar, pa.a aVar) {
        j.e(fVar, "_applicationService");
        j.e(dVar, "_dataController");
        j.e(aVar, "_notificationDisplayBuilder");
        this._applicationService = fVar;
        this._dataController = dVar;
        this._notificationDisplayBuilder = aVar;
    }

    private final Intent createBaseSummaryIntent(int i10, com.onesignal.notifications.internal.display.impl.a aVar, JSONObject jSONObject, String str) {
        Intent putExtra = aVar.getNewBaseIntent(i10).putExtra("onesignalData", jSONObject.toString()).putExtra("summary", str);
        j.d(putExtra, "intentGenerator.getNewBa…utExtra(\"summary\", group)");
        return putExtra;
    }

    private final Context getCurrentContext() {
        return this._applicationService.getAppContext();
    }

    @Override // pa.c
    public void createGenericPendingIntentsForGroup(i iVar, com.onesignal.notifications.internal.display.impl.a aVar, JSONObject jSONObject, String str, int i10) {
        j.e(aVar, "intentGenerator");
        j.e(jSONObject, "gcmBundle");
        j.e(str, "group");
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt();
        Intent putExtra = aVar.getNewBaseIntent(i10).putExtra("onesignalData", jSONObject.toString()).putExtra("grp", str);
        j.d(putExtra, "intentGenerator.getNewBa…)).putExtra(\"grp\", group)");
        PendingIntent newActionPendingIntent = aVar.getNewActionPendingIntent(nextInt, putExtra);
        j.b(iVar);
        iVar.f8242g = newActionPendingIntent;
        pa.a aVar2 = this._notificationDisplayBuilder;
        int nextInt2 = secureRandom.nextInt();
        Intent putExtra2 = this._notificationDisplayBuilder.getNewBaseDismissIntent(i10).putExtra("grp", str);
        j.d(putExtra2, "_notificationDisplayBuil…d).putExtra(\"grp\", group)");
        iVar.f8257v.deleteIntent = aVar2.getNewDismissActionPendingIntent(nextInt2, putExtra2);
        iVar.f8248m = str;
        try {
            iVar.f8255t = this._notificationDisplayBuilder.getGroupAlertBehavior();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(12:5|6|(1:(1:9)(2:24|25))(2:26|(1:28)(1:29))|10|(1:12)|13|(1:15)|16|17|18|19|20))|30|6|(0)(0)|10|(0)|13|(0)|16|17|18|19|20) */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // pa.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createGrouplessSummaryNotification(na.d dVar, com.onesignal.notifications.internal.display.impl.a aVar, int i10, int i11, fc.d dVar2) {
        a aVar2;
        int i12;
        JSONObject jsonPayload;
        SecureRandom secureRandom;
        String str;
        na.d dVar3;
        int i13;
        d dVar4;
        String str2;
        if (dVar2 instanceof a) {
            aVar2 = (a) dVar2;
            int i14 = aVar2.label;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                aVar2.label = i14 - Integer.MIN_VALUE;
                Object obj = aVar2.result;
                i12 = aVar2.label;
                if (i12 != 0) {
                    v6.a.W(obj);
                    jsonPayload = dVar.getJsonPayload();
                    j.b(jsonPayload);
                    secureRandom = new SecureRandom();
                    str = i10 + " new messages";
                    oa.d dVar5 = this._dataController;
                    aVar2.L$0 = this;
                    aVar2.L$1 = dVar;
                    aVar2.L$2 = aVar;
                    aVar2.L$3 = jsonPayload;
                    aVar2.L$4 = secureRandom;
                    aVar2.L$5 = e.GROUPLESS_SUMMARY_KEY;
                    aVar2.L$6 = str;
                    aVar2.I$0 = i10;
                    aVar2.I$1 = i11;
                    aVar2.I$2 = e.GROUPLESS_SUMMARY_ID;
                    aVar2.label = 1;
                    Object createSummaryNotification = dVar5.createSummaryNotification(e.GROUPLESS_SUMMARY_ID, e.GROUPLESS_SUMMARY_KEY, aVar2);
                    gc.a aVar3 = gc.a.f2559g;
                    if (createSummaryNotification == aVar3) {
                        return aVar3;
                    }
                    dVar3 = dVar;
                    i13 = -718463522;
                    dVar4 = this;
                    str2 = e.GROUPLESS_SUMMARY_KEY;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i13 = aVar2.I$2;
                    i11 = aVar2.I$1;
                    i10 = aVar2.I$0;
                    String str3 = (String) aVar2.L$6;
                    str2 = (String) aVar2.L$5;
                    secureRandom = (SecureRandom) aVar2.L$4;
                    jsonPayload = (JSONObject) aVar2.L$3;
                    com.onesignal.notifications.internal.display.impl.a aVar4 = (com.onesignal.notifications.internal.display.impl.a) aVar2.L$2;
                    dVar3 = (na.d) aVar2.L$1;
                    dVar4 = (d) aVar2.L$0;
                    v6.a.W(obj);
                    str = str3;
                    aVar = aVar4;
                }
                PendingIntent newActionPendingIntent = aVar.getNewActionPendingIntent(secureRandom.nextInt(), dVar4.createBaseSummaryIntent(i13, aVar, jsonPayload, str2));
                pa.a aVar5 = dVar4._notificationDisplayBuilder;
                int nextInt = secureRandom.nextInt();
                Intent putExtra = dVar4._notificationDisplayBuilder.getNewBaseDismissIntent(0).putExtra("summary", str2);
                j.d(putExtra, "_notificationDisplayBuil…utExtra(\"summary\", group)");
                PendingIntent newDismissActionPendingIntent = aVar5.getNewDismissActionPendingIntent(nextInt, putExtra);
                i compatBuilder = dVar4._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(dVar3).getCompatBuilder();
                if (dVar3.getOverriddenSound() != null) {
                    j.b(compatBuilder);
                    compatBuilder.f(dVar3.getOverriddenSound());
                }
                if (dVar3.getOverriddenFlags() != null) {
                    j.b(compatBuilder);
                    Integer overriddenFlags = dVar3.getOverriddenFlags();
                    j.b(overriddenFlags);
                    compatBuilder.c(overriddenFlags.intValue());
                }
                j.b(compatBuilder);
                compatBuilder.f8242g = newActionPendingIntent;
                compatBuilder.f8257v.deleteIntent = newDismissActionPendingIntent;
                Context currentContext = dVar4.getCurrentContext();
                j.b(currentContext);
                PackageManager packageManager = currentContext.getPackageManager();
                Context currentContext2 = dVar4.getCurrentContext();
                j.b(currentContext2);
                compatBuilder.f8240e = i.b(packageManager.getApplicationLabel(currentContext2.getApplicationInfo()));
                compatBuilder.f8241f = i.b(str);
                compatBuilder.f8244i = i10;
                compatBuilder.f8257v.icon = dVar4._notificationDisplayBuilder.getDefaultSmallIconId();
                compatBuilder.e(dVar4._notificationDisplayBuilder.getDefaultLargeIcon());
                compatBuilder.d(8, true);
                compatBuilder.d(16, false);
                compatBuilder.f8248m = str2;
                compatBuilder.f8249n = true;
                compatBuilder.f8255t = i11;
                g gVar = new g(1);
                gVar.f8260b = i.b(str);
                compatBuilder.g(gVar);
                Notification a6 = compatBuilder.a();
                j.d(a6, "summaryBuilder.build()");
                Context currentContext3 = dVar4.getCurrentContext();
                j.b(currentContext3);
                new q(currentContext3).a(i13, a6);
                return o.f277a;
            }
        }
        aVar2 = new a(dVar2);
        Object obj2 = aVar2.result;
        i12 = aVar2.label;
        if (i12 != 0) {
        }
        PendingIntent newActionPendingIntent2 = aVar.getNewActionPendingIntent(secureRandom.nextInt(), dVar4.createBaseSummaryIntent(i13, aVar, jsonPayload, str2));
        pa.a aVar52 = dVar4._notificationDisplayBuilder;
        int nextInt2 = secureRandom.nextInt();
        Intent putExtra2 = dVar4._notificationDisplayBuilder.getNewBaseDismissIntent(0).putExtra("summary", str2);
        j.d(putExtra2, "_notificationDisplayBuil…utExtra(\"summary\", group)");
        PendingIntent newDismissActionPendingIntent2 = aVar52.getNewDismissActionPendingIntent(nextInt2, putExtra2);
        i compatBuilder2 = dVar4._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(dVar3).getCompatBuilder();
        if (dVar3.getOverriddenSound() != null) {
        }
        if (dVar3.getOverriddenFlags() != null) {
        }
        j.b(compatBuilder2);
        compatBuilder2.f8242g = newActionPendingIntent2;
        compatBuilder2.f8257v.deleteIntent = newDismissActionPendingIntent2;
        Context currentContext4 = dVar4.getCurrentContext();
        j.b(currentContext4);
        PackageManager packageManager2 = currentContext4.getPackageManager();
        Context currentContext22 = dVar4.getCurrentContext();
        j.b(currentContext22);
        compatBuilder2.f8240e = i.b(packageManager2.getApplicationLabel(currentContext22.getApplicationInfo()));
        compatBuilder2.f8241f = i.b(str);
        compatBuilder2.f8244i = i10;
        compatBuilder2.f8257v.icon = dVar4._notificationDisplayBuilder.getDefaultSmallIconId();
        compatBuilder2.e(dVar4._notificationDisplayBuilder.getDefaultLargeIcon());
        compatBuilder2.d(8, true);
        compatBuilder2.d(16, false);
        compatBuilder2.f8248m = str2;
        compatBuilder2.f8249n = true;
        compatBuilder2.f8255t = i11;
        g gVar2 = new g(1);
        gVar2.f8260b = i.b(str);
        compatBuilder2.g(gVar2);
        Notification a62 = compatBuilder2.a();
        j.d(a62, "summaryBuilder.build()");
        Context currentContext32 = dVar4.getCurrentContext();
        j.b(currentContext32);
        new q(currentContext32).a(i13, a62);
        return o.f277a;
    }

    @Override // pa.c
    public Notification createSingleNotificationBeforeSummaryBuilder(na.d dVar, i iVar) {
        j.e(dVar, "notificationJob");
        j.b(iVar);
        Notification a6 = iVar.a();
        j.d(a6, "notifBuilder!!.build()");
        return a6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x023a A[EDGE_INSN: B:36:0x023a->B:37:0x023a BREAK  A[LOOP:0: B:13:0x01c7->B:30:0x01c7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // pa.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createSummaryNotification(na.d dVar, b.a aVar, int i10, fc.d dVar2) {
        b bVar;
        int i11;
        com.onesignal.notifications.internal.display.impl.a aVar2;
        String optString;
        PendingIntent newDismissActionPendingIntent;
        na.d dVar3;
        b.a aVar3;
        int i12;
        JSONObject jSONObject;
        boolean z10;
        SecureRandom secureRandom;
        d dVar4;
        Integer num;
        Integer num2;
        b.a aVar4;
        com.onesignal.notifications.internal.display.impl.a aVar5;
        int i13;
        JSONObject jSONObject2;
        na.d dVar5;
        String str;
        b.a aVar6;
        Integer num3;
        int i14;
        na.d dVar6;
        boolean z11;
        boolean z12;
        d dVar7;
        PendingIntent pendingIntent;
        SecureRandom secureRandom2;
        String str2;
        com.onesignal.notifications.internal.display.impl.a aVar7;
        JSONObject jSONObject3;
        b.a aVar8;
        boolean z13;
        Iterator it;
        Integer num4;
        String str3;
        PendingIntent newActionPendingIntent;
        Notification a6;
        String str4;
        String obj;
        oa.c cVar;
        if (dVar2 instanceof b) {
            bVar = (b) dVar2;
            int i15 = bVar.label;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                bVar.label = i15 - Integer.MIN_VALUE;
                Object obj2 = bVar.result;
                i11 = bVar.label;
                gc.a aVar9 = gc.a.f2559g;
                if (i11 != 0) {
                    v6.a.W(obj2);
                    boolean isRestoring = dVar.isRestoring();
                    JSONObject jsonPayload = dVar.getJsonPayload();
                    j.b(jsonPayload);
                    Context currentContext = getCurrentContext();
                    j.b(currentContext);
                    aVar2 = new com.onesignal.notifications.internal.display.impl.a(currentContext);
                    optString = jsonPayload.optString("grp", null);
                    SecureRandom secureRandom3 = new SecureRandom();
                    pa.a aVar10 = this._notificationDisplayBuilder;
                    int nextInt = secureRandom3.nextInt();
                    Intent putExtra = this._notificationDisplayBuilder.getNewBaseDismissIntent(0).putExtra("summary", optString);
                    j.d(putExtra, "_notificationDisplayBuil…utExtra(\"summary\", group)");
                    newDismissActionPendingIntent = aVar10.getNewDismissActionPendingIntent(nextInt, putExtra);
                    oa.d dVar8 = this._dataController;
                    j.d(optString, "group");
                    bVar.L$0 = this;
                    dVar3 = dVar;
                    bVar.L$1 = dVar3;
                    aVar3 = aVar;
                    bVar.L$2 = aVar3;
                    bVar.L$3 = jsonPayload;
                    bVar.L$4 = aVar2;
                    bVar.L$5 = optString;
                    bVar.L$6 = secureRandom3;
                    bVar.L$7 = newDismissActionPendingIntent;
                    i12 = i10;
                    bVar.I$0 = i12;
                    bVar.Z$0 = isRestoring;
                    bVar.label = 1;
                    Object androidIdForGroup = dVar8.getAndroidIdForGroup(optString, true, bVar);
                    if (androidIdForGroup != aVar9) {
                        jSONObject = jsonPayload;
                        z10 = isRestoring;
                        obj2 = androidIdForGroup;
                        secureRandom = secureRandom3;
                        dVar4 = this;
                    }
                    return aVar9;
                }
                if (i11 != 1) {
                    if (i11 == 2) {
                        boolean z14 = bVar.Z$0;
                        i14 = bVar.I$0;
                        num3 = (Integer) bVar.L$8;
                        newDismissActionPendingIntent = (PendingIntent) bVar.L$7;
                        secureRandom = (SecureRandom) bVar.L$6;
                        str = (String) bVar.L$5;
                        aVar5 = (com.onesignal.notifications.internal.display.impl.a) bVar.L$4;
                        jSONObject2 = (JSONObject) bVar.L$3;
                        aVar6 = (b.a) bVar.L$2;
                        dVar6 = (na.d) bVar.L$1;
                        dVar4 = (d) bVar.L$0;
                        v6.a.W(obj2);
                        z11 = z14;
                        aVar4 = aVar6;
                        i13 = i14;
                        num2 = num3;
                        dVar5 = dVar6;
                        z12 = z11;
                        oa.d dVar9 = dVar4._dataController;
                        j.d(str, "group");
                        bVar.L$0 = dVar4;
                        bVar.L$1 = dVar5;
                        bVar.L$2 = aVar4;
                        bVar.L$3 = jSONObject2;
                        bVar.L$4 = aVar5;
                        bVar.L$5 = str;
                        bVar.L$6 = secureRandom;
                        bVar.L$7 = newDismissActionPendingIntent;
                        bVar.L$8 = num2;
                        bVar.I$0 = i13;
                        bVar.Z$0 = z12;
                        bVar.label = 3;
                        obj2 = dVar9.listNotificationsForGroup(str, bVar);
                        if (obj2 != aVar9) {
                            dVar7 = dVar4;
                            pendingIntent = newDismissActionPendingIntent;
                            secureRandom2 = secureRandom;
                            str2 = str;
                            aVar7 = aVar5;
                            jSONObject3 = jSONObject2;
                            aVar8 = aVar4;
                            z13 = z12;
                            ArrayList arrayList = new ArrayList();
                            it = ((List) obj2).iterator();
                            String str5 = null;
                            while (true) {
                                Iterator it2 = it;
                                num4 = num2;
                                str3 = "";
                                if (it.hasNext()) {
                                }
                            }
                            int nextInt2 = secureRandom2.nextInt();
                            j.b(num4);
                            int intValue = num4.intValue();
                            j.d(str2, "group");
                            newActionPendingIntent = aVar7.getNewActionPendingIntent(nextInt2, dVar7.createBaseSummaryIntent(intValue, aVar7, jSONObject3, str2));
                            if (z13 != 0) {
                            }
                            j.b(aVar8);
                            i compatBuilder = aVar8.getCompatBuilder();
                            j.b(compatBuilder);
                            compatBuilder.f8237b.clear();
                            dVar7._notificationDisplayBuilder.addNotificationActionButtons(jSONObject3, aVar7, compatBuilder, num4.intValue(), str2);
                            compatBuilder.f8242g = newActionPendingIntent;
                            compatBuilder.f8257v.deleteIntent = pendingIntent;
                            compatBuilder.d(8, z13);
                            compatBuilder.d(16, false);
                            compatBuilder.f8248m = str2;
                            compatBuilder.f8249n = true;
                            compatBuilder.f8255t = i13;
                            a6 = compatBuilder.a();
                            j.d(a6, "summaryBuilder.build()");
                            dVar7._notificationDisplayBuilder.addXiaomiSettings(aVar8, a6);
                            Context currentContext2 = dVar7.getCurrentContext();
                            j.b(currentContext2);
                            new q(currentContext2).a(num4.intValue(), a6);
                            return o.f277a;
                        }
                        return aVar9;
                    }
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z15 = bVar.Z$0;
                    i13 = bVar.I$0;
                    num2 = (Integer) bVar.L$8;
                    pendingIntent = (PendingIntent) bVar.L$7;
                    secureRandom2 = (SecureRandom) bVar.L$6;
                    str2 = (String) bVar.L$5;
                    aVar7 = (com.onesignal.notifications.internal.display.impl.a) bVar.L$4;
                    jSONObject3 = (JSONObject) bVar.L$3;
                    aVar8 = (b.a) bVar.L$2;
                    dVar5 = (na.d) bVar.L$1;
                    dVar7 = (d) bVar.L$0;
                    v6.a.W(obj2);
                    z13 = z15;
                    ArrayList arrayList2 = new ArrayList();
                    it = ((List) obj2).iterator();
                    String str52 = null;
                    while (true) {
                        Iterator it22 = it;
                        num4 = num2;
                        str3 = "";
                        if (it.hasNext()) {
                            break;
                        }
                        oa.c cVar2 = (oa.c) it22.next();
                        String str6 = str52;
                        if (z13 == 0) {
                            cVar = cVar2;
                            if (cVar2.getAndroidId() == dVar5.getAndroidId()) {
                                it = it22;
                                num2 = num4;
                                str52 = str6;
                            }
                        } else {
                            cVar = cVar2;
                        }
                        String title = cVar.getTitle();
                        str3 = title != null ? title.concat(" ") : "";
                        SpannableString spannableString = new SpannableString(str3 + cVar.getMessage());
                        if (str3.length() > 0) {
                            spannableString.setSpan(new StyleSpan(1), 0, str3.length(), 0);
                        }
                        arrayList2.add(spannableString);
                        if (str6 == null) {
                            str52 = cVar.getFullData();
                            it = it22;
                            num2 = num4;
                        } else {
                            it = it22;
                            num2 = num4;
                            str52 = str6;
                        }
                    }
                    int nextInt22 = secureRandom2.nextInt();
                    j.b(num4);
                    int intValue2 = num4.intValue();
                    j.d(str2, "group");
                    newActionPendingIntent = aVar7.getNewActionPendingIntent(nextInt22, dVar7.createBaseSummaryIntent(intValue2, aVar7, jSONObject3, str2));
                    if ((z13 != 0 || arrayList2.size() <= 1) && (z13 != 0 || arrayList2.size() <= 0)) {
                        j.b(aVar8);
                        i compatBuilder2 = aVar8.getCompatBuilder();
                        j.b(compatBuilder2);
                        compatBuilder2.f8237b.clear();
                        dVar7._notificationDisplayBuilder.addNotificationActionButtons(jSONObject3, aVar7, compatBuilder2, num4.intValue(), str2);
                        compatBuilder2.f8242g = newActionPendingIntent;
                        compatBuilder2.f8257v.deleteIntent = pendingIntent;
                        compatBuilder2.d(8, z13);
                        compatBuilder2.d(16, false);
                        compatBuilder2.f8248m = str2;
                        compatBuilder2.f8249n = true;
                        try {
                            compatBuilder2.f8255t = i13;
                        } catch (Throwable unused) {
                        }
                        a6 = compatBuilder2.a();
                        j.d(a6, "summaryBuilder.build()");
                        dVar7._notificationDisplayBuilder.addXiaomiSettings(aVar8, a6);
                    } else {
                        int size = arrayList2.size() + (!z13);
                        String safeString = com.onesignal.common.f.safeString(jSONObject3, "grp_msg");
                        if (safeString != null) {
                            str4 = h.w(safeString, "$[notif_count]", "" + size);
                        } else {
                            str4 = size + " new messages";
                        }
                        i compatBuilder3 = dVar7._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(dVar5).getCompatBuilder();
                        if (z13 != 0) {
                            dVar7._notificationDisplayBuilder.removeNotifyOptions(compatBuilder3);
                        } else {
                            if (dVar5.getOverriddenSound() != null) {
                                j.b(compatBuilder3);
                                compatBuilder3.f(dVar5.getOverriddenSound());
                            }
                            if (dVar5.getOverriddenFlags() != null) {
                                j.b(compatBuilder3);
                                Integer overriddenFlags = dVar5.getOverriddenFlags();
                                j.b(overriddenFlags);
                                compatBuilder3.c(overriddenFlags.intValue());
                            }
                        }
                        j.b(compatBuilder3);
                        compatBuilder3.f8242g = newActionPendingIntent;
                        compatBuilder3.f8257v.deleteIntent = pendingIntent;
                        Context currentContext3 = dVar7.getCurrentContext();
                        j.b(currentContext3);
                        PackageManager packageManager = currentContext3.getPackageManager();
                        Context currentContext4 = dVar7.getCurrentContext();
                        j.b(currentContext4);
                        compatBuilder3.f8240e = i.b(packageManager.getApplicationLabel(currentContext4.getApplicationInfo()));
                        compatBuilder3.f8241f = i.b(str4);
                        compatBuilder3.f8244i = size;
                        compatBuilder3.f8257v.icon = dVar7._notificationDisplayBuilder.getDefaultSmallIconId();
                        compatBuilder3.e(dVar7._notificationDisplayBuilder.getDefaultLargeIcon());
                        compatBuilder3.d(8, z13);
                        compatBuilder3.d(16, false);
                        compatBuilder3.f8248m = str2;
                        compatBuilder3.f8249n = true;
                        try {
                            compatBuilder3.f8255t = i13;
                        } catch (Throwable unused2) {
                        }
                        if (z13 == 0) {
                            compatBuilder3.f8257v.tickerText = i.b(str4);
                        }
                        g gVar = new g(1);
                        if (z13 == 0) {
                            String valueOf = dVar5.getTitle() != null ? String.valueOf(dVar5.getTitle()) : null;
                            String concat = valueOf == null ? "" : valueOf.concat(" ");
                            CharSequence body = dVar5.getBody();
                            if (body != null && (obj = body.toString()) != null) {
                                str3 = obj;
                            }
                            SpannableString spannableString2 = new SpannableString(a4.d.i(concat, str3));
                            if (concat.length() > 0) {
                                spannableString2.setSpan(new StyleSpan(1), 0, concat.length(), 0);
                            }
                            ((ArrayList) gVar.f8235f).add(i.b(spannableString2));
                        }
                        int size2 = arrayList2.size();
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj3 = arrayList2.get(i16);
                            i16++;
                            SpannableString spannableString3 = (SpannableString) obj3;
                            if (spannableString3 != null) {
                                ((ArrayList) gVar.f8235f).add(i.b(spannableString3));
                            }
                        }
                        gVar.f8260b = i.b(str4);
                        compatBuilder3.g(gVar);
                        a6 = compatBuilder3.a();
                        j.d(a6, "summaryBuilder.build()");
                    }
                    Context currentContext22 = dVar7.getCurrentContext();
                    j.b(currentContext22);
                    new q(currentContext22).a(num4.intValue(), a6);
                    return o.f277a;
                }
                boolean z16 = bVar.Z$0;
                int i17 = bVar.I$0;
                PendingIntent pendingIntent2 = (PendingIntent) bVar.L$7;
                SecureRandom secureRandom4 = (SecureRandom) bVar.L$6;
                String str7 = (String) bVar.L$5;
                com.onesignal.notifications.internal.display.impl.a aVar11 = (com.onesignal.notifications.internal.display.impl.a) bVar.L$4;
                JSONObject jSONObject4 = (JSONObject) bVar.L$3;
                b.a aVar12 = (b.a) bVar.L$2;
                na.d dVar10 = (na.d) bVar.L$1;
                d dVar11 = (d) bVar.L$0;
                v6.a.W(obj2);
                i12 = i17;
                aVar2 = aVar11;
                newDismissActionPendingIntent = pendingIntent2;
                optString = str7;
                dVar4 = dVar11;
                secureRandom = secureRandom4;
                jSONObject = jSONObject4;
                aVar3 = aVar12;
                dVar3 = dVar10;
                z10 = z16;
                num = (Integer) obj2;
                if (num == null) {
                    num2 = num;
                    aVar4 = aVar3;
                    aVar5 = aVar2;
                    i13 = i12;
                    jSONObject2 = jSONObject;
                    dVar5 = dVar3;
                    str = optString;
                    z12 = z10;
                    oa.d dVar92 = dVar4._dataController;
                    j.d(str, "group");
                    bVar.L$0 = dVar4;
                    bVar.L$1 = dVar5;
                    bVar.L$2 = aVar4;
                    bVar.L$3 = jSONObject2;
                    bVar.L$4 = aVar5;
                    bVar.L$5 = str;
                    bVar.L$6 = secureRandom;
                    bVar.L$7 = newDismissActionPendingIntent;
                    bVar.L$8 = num2;
                    bVar.I$0 = i13;
                    bVar.Z$0 = z12;
                    bVar.label = 3;
                    obj2 = dVar92.listNotificationsForGroup(str, bVar);
                    if (obj2 != aVar9) {
                    }
                    return aVar9;
                }
                Integer num5 = new Integer(secureRandom.nextInt());
                oa.d dVar12 = dVar4._dataController;
                int intValue3 = num5.intValue();
                j.d(optString, "group");
                bVar.L$0 = dVar4;
                bVar.L$1 = dVar3;
                bVar.L$2 = aVar3;
                bVar.L$3 = jSONObject;
                bVar.L$4 = aVar2;
                bVar.L$5 = optString;
                bVar.L$6 = secureRandom;
                bVar.L$7 = newDismissActionPendingIntent;
                bVar.L$8 = num5;
                bVar.I$0 = i12;
                bVar.Z$0 = z10;
                boolean z17 = z10;
                bVar.label = 2;
                if (dVar12.createSummaryNotification(intValue3, optString, bVar) != aVar9) {
                    b.a aVar13 = aVar3;
                    aVar5 = aVar2;
                    aVar6 = aVar13;
                    JSONObject jSONObject5 = jSONObject;
                    num3 = num5;
                    i14 = i12;
                    jSONObject2 = jSONObject5;
                    na.d dVar13 = dVar3;
                    str = optString;
                    dVar6 = dVar13;
                    z11 = z17;
                    aVar4 = aVar6;
                    i13 = i14;
                    num2 = num3;
                    dVar5 = dVar6;
                    z12 = z11;
                    oa.d dVar922 = dVar4._dataController;
                    j.d(str, "group");
                    bVar.L$0 = dVar4;
                    bVar.L$1 = dVar5;
                    bVar.L$2 = aVar4;
                    bVar.L$3 = jSONObject2;
                    bVar.L$4 = aVar5;
                    bVar.L$5 = str;
                    bVar.L$6 = secureRandom;
                    bVar.L$7 = newDismissActionPendingIntent;
                    bVar.L$8 = num2;
                    bVar.I$0 = i13;
                    bVar.Z$0 = z12;
                    bVar.label = 3;
                    obj2 = dVar922.listNotificationsForGroup(str, bVar);
                    if (obj2 != aVar9) {
                    }
                }
                return aVar9;
            }
        }
        bVar = new b(dVar2);
        Object obj22 = bVar.result;
        i11 = bVar.label;
        gc.a aVar92 = gc.a.f2559g;
        if (i11 != 0) {
        }
        num = (Integer) obj22;
        if (num == null) {
        }
    }

    @Override // pa.c
    public Object updateSummaryNotification(na.d dVar, fc.d dVar2) {
        Object createSummaryNotification = createSummaryNotification(dVar, null, this._notificationDisplayBuilder.getGroupAlertBehavior(), dVar2);
        return createSummaryNotification == gc.a.f2559g ? createSummaryNotification : o.f277a;
    }
}
