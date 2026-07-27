package com.onesignal.notifications.internal.display.impl;

import D.N;
import D.t;
import D.v;
import Q7.q;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import com.icefishing.icefishinglive2.AbstractC4404f;
import com.onesignal.notifications.internal.display.impl.b;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.h;
import org.json.JSONObject;
import t5.e;
import u.AbstractC5049e;
import u5.C5082c;
import v5.InterfaceC5115a;
import v5.InterfaceC5117c;
import x4.f;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class d implements InterfaceC5117c {
    private final f _applicationService;
    private final u5.d _dataController;
    private final InterfaceC5115a _notificationDisplayBuilder;

    public static final class a extends B7.c {
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

        public a(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.createGrouplessSummaryNotification(null, null, 0, 0, this);
        }
    }

    public static final class b extends B7.c {
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

        public b(InterfaceC5267d interfaceC5267d) {
            super(interfaceC5267d);
        }

        @Override // B7.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.createSummaryNotification(null, null, 0, this);
        }
    }

    public d(f _applicationService, u5.d _dataController, InterfaceC5115a _notificationDisplayBuilder) {
        h.e(_applicationService, "_applicationService");
        h.e(_dataController, "_dataController");
        h.e(_notificationDisplayBuilder, "_notificationDisplayBuilder");
        this._applicationService = _applicationService;
        this._dataController = _dataController;
        this._notificationDisplayBuilder = _notificationDisplayBuilder;
    }

    private final Intent createBaseSummaryIntent(int i, com.onesignal.notifications.internal.display.impl.a aVar, JSONObject jSONObject, String str) {
        Intent putExtra = aVar.getNewBaseIntent(i).putExtra("onesignalData", jSONObject.toString()).putExtra("summary", str);
        h.d(putExtra, "putExtra(...)");
        return putExtra;
    }

    private final Context getCurrentContext() {
        return this._applicationService.getAppContext();
    }

    @Override // v5.InterfaceC5117c
    public void createGenericPendingIntentsForGroup(v vVar, com.onesignal.notifications.internal.display.impl.a intentGenerator, JSONObject gcmBundle, String group, int i) {
        h.e(intentGenerator, "intentGenerator");
        h.e(gcmBundle, "gcmBundle");
        h.e(group, "group");
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt();
        Intent putExtra = intentGenerator.getNewBaseIntent(i).putExtra("onesignalData", gcmBundle.toString()).putExtra("grp", group);
        h.d(putExtra, "putExtra(...)");
        PendingIntent newActionPendingIntent = intentGenerator.getNewActionPendingIntent(nextInt, putExtra);
        h.b(vVar);
        vVar.f500g = newActionPendingIntent;
        InterfaceC5115a interfaceC5115a = this._notificationDisplayBuilder;
        int nextInt2 = secureRandom.nextInt();
        Intent putExtra2 = this._notificationDisplayBuilder.getNewBaseDismissIntent(i).putExtra("grp", group);
        h.d(putExtra2, "putExtra(...)");
        vVar.f514v.deleteIntent = interfaceC5115a.getNewDismissActionPendingIntent(nextInt2, putExtra2);
        vVar.f505m = group;
        try {
            vVar.f512t = this._notificationDisplayBuilder.getGroupAlertBehavior();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(12:5|6|(1:(1:9)(2:24|25))(2:26|(1:28)(1:29))|10|(1:12)|13|(1:15)|16|17|18|19|20))|30|6|(0)(0)|10|(0)|13|(0)|16|17|18|19|20) */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // v5.InterfaceC5117c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createGrouplessSummaryNotification(t5.d dVar, com.onesignal.notifications.internal.display.impl.a aVar, int i, int i6, InterfaceC5267d interfaceC5267d) {
        a aVar2;
        int i9;
        JSONObject jsonPayload;
        SecureRandom secureRandom;
        String str;
        d dVar2;
        String str2;
        t5.d dVar3;
        int i10;
        if (interfaceC5267d instanceof a) {
            aVar2 = (a) interfaceC5267d;
            int i11 = aVar2.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar2.label = i11 - Integer.MIN_VALUE;
                Object obj = aVar2.result;
                A7.a aVar3 = A7.a.f58n;
                i9 = aVar2.label;
                if (i9 != 0) {
                    com.bumptech.glide.d.k(obj);
                    jsonPayload = dVar.getJsonPayload();
                    h.b(jsonPayload);
                    secureRandom = new SecureRandom();
                    str = i + " new messages";
                    u5.d dVar4 = this._dataController;
                    aVar2.L$0 = this;
                    aVar2.L$1 = dVar;
                    aVar2.L$2 = aVar;
                    aVar2.L$3 = jsonPayload;
                    aVar2.L$4 = secureRandom;
                    aVar2.L$5 = e.GROUPLESS_SUMMARY_KEY;
                    aVar2.L$6 = str;
                    aVar2.I$0 = i;
                    aVar2.I$1 = i6;
                    aVar2.I$2 = e.GROUPLESS_SUMMARY_ID;
                    aVar2.label = 1;
                    if (dVar4.createSummaryNotification(e.GROUPLESS_SUMMARY_ID, e.GROUPLESS_SUMMARY_KEY, aVar2) == aVar3) {
                        return aVar3;
                    }
                    dVar2 = this;
                    str2 = e.GROUPLESS_SUMMARY_KEY;
                    dVar3 = dVar;
                    i10 = -718463522;
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = aVar2.I$2;
                    i6 = aVar2.I$1;
                    i = aVar2.I$0;
                    String str3 = (String) aVar2.L$6;
                    str2 = (String) aVar2.L$5;
                    secureRandom = (SecureRandom) aVar2.L$4;
                    jsonPayload = (JSONObject) aVar2.L$3;
                    com.onesignal.notifications.internal.display.impl.a aVar4 = (com.onesignal.notifications.internal.display.impl.a) aVar2.L$2;
                    dVar3 = (t5.d) aVar2.L$1;
                    dVar2 = (d) aVar2.L$0;
                    com.bumptech.glide.d.k(obj);
                    str = str3;
                    aVar = aVar4;
                }
                PendingIntent newActionPendingIntent = aVar.getNewActionPendingIntent(secureRandom.nextInt(), dVar2.createBaseSummaryIntent(i10, aVar, jsonPayload, str2));
                InterfaceC5115a interfaceC5115a = dVar2._notificationDisplayBuilder;
                int nextInt = secureRandom.nextInt();
                Intent putExtra = dVar2._notificationDisplayBuilder.getNewBaseDismissIntent(0).putExtra("summary", str2);
                h.d(putExtra, "putExtra(...)");
                PendingIntent newDismissActionPendingIntent = interfaceC5115a.getNewDismissActionPendingIntent(nextInt, putExtra);
                v compatBuilder = dVar2._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(dVar3).getCompatBuilder();
                if (dVar3.getOverriddenSound() != null) {
                    h.b(compatBuilder);
                    compatBuilder.f(dVar3.getOverriddenSound());
                }
                if (dVar3.getOverriddenFlags() != null) {
                    h.b(compatBuilder);
                    Integer overriddenFlags = dVar3.getOverriddenFlags();
                    h.b(overriddenFlags);
                    compatBuilder.c(overriddenFlags.intValue());
                }
                h.b(compatBuilder);
                compatBuilder.f500g = newActionPendingIntent;
                compatBuilder.f514v.deleteIntent = newDismissActionPendingIntent;
                Context currentContext = dVar2.getCurrentContext();
                h.b(currentContext);
                PackageManager packageManager = currentContext.getPackageManager();
                Context currentContext2 = dVar2.getCurrentContext();
                h.b(currentContext2);
                compatBuilder.f498e = v.b(packageManager.getApplicationLabel(currentContext2.getApplicationInfo()));
                compatBuilder.f499f = v.b(str);
                compatBuilder.i = i;
                compatBuilder.f514v.icon = dVar2._notificationDisplayBuilder.getDefaultSmallIconId();
                compatBuilder.e(dVar2._notificationDisplayBuilder.getDefaultLargeIcon());
                compatBuilder.d(8, true);
                compatBuilder.d(16, false);
                compatBuilder.f505m = str2;
                compatBuilder.f506n = true;
                compatBuilder.f512t = i6;
                t tVar = new t(1);
                tVar.f517b = v.b(str);
                compatBuilder.g(tVar);
                Notification a9 = compatBuilder.a();
                h.d(a9, "build(...)");
                Context currentContext3 = dVar2.getCurrentContext();
                h.b(currentContext3);
                new N(currentContext3).a(i10, a9);
                return u7.v.f41350a;
            }
        }
        aVar2 = new a(interfaceC5267d);
        Object obj2 = aVar2.result;
        A7.a aVar32 = A7.a.f58n;
        i9 = aVar2.label;
        if (i9 != 0) {
        }
        PendingIntent newActionPendingIntent2 = aVar.getNewActionPendingIntent(secureRandom.nextInt(), dVar2.createBaseSummaryIntent(i10, aVar, jsonPayload, str2));
        InterfaceC5115a interfaceC5115a2 = dVar2._notificationDisplayBuilder;
        int nextInt2 = secureRandom.nextInt();
        Intent putExtra2 = dVar2._notificationDisplayBuilder.getNewBaseDismissIntent(0).putExtra("summary", str2);
        h.d(putExtra2, "putExtra(...)");
        PendingIntent newDismissActionPendingIntent2 = interfaceC5115a2.getNewDismissActionPendingIntent(nextInt2, putExtra2);
        v compatBuilder2 = dVar2._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(dVar3).getCompatBuilder();
        if (dVar3.getOverriddenSound() != null) {
        }
        if (dVar3.getOverriddenFlags() != null) {
        }
        h.b(compatBuilder2);
        compatBuilder2.f500g = newActionPendingIntent2;
        compatBuilder2.f514v.deleteIntent = newDismissActionPendingIntent2;
        Context currentContext4 = dVar2.getCurrentContext();
        h.b(currentContext4);
        PackageManager packageManager2 = currentContext4.getPackageManager();
        Context currentContext22 = dVar2.getCurrentContext();
        h.b(currentContext22);
        compatBuilder2.f498e = v.b(packageManager2.getApplicationLabel(currentContext22.getApplicationInfo()));
        compatBuilder2.f499f = v.b(str);
        compatBuilder2.i = i;
        compatBuilder2.f514v.icon = dVar2._notificationDisplayBuilder.getDefaultSmallIconId();
        compatBuilder2.e(dVar2._notificationDisplayBuilder.getDefaultLargeIcon());
        compatBuilder2.d(8, true);
        compatBuilder2.d(16, false);
        compatBuilder2.f505m = str2;
        compatBuilder2.f506n = true;
        compatBuilder2.f512t = i6;
        t tVar2 = new t(1);
        tVar2.f517b = v.b(str);
        compatBuilder2.g(tVar2);
        Notification a92 = compatBuilder2.a();
        h.d(a92, "build(...)");
        Context currentContext32 = dVar2.getCurrentContext();
        h.b(currentContext32);
        new N(currentContext32).a(i10, a92);
        return u7.v.f41350a;
    }

    @Override // v5.InterfaceC5117c
    public Notification createSingleNotificationBeforeSummaryBuilder(t5.d notificationJob, v vVar) {
        h.e(notificationJob, "notificationJob");
        h.b(vVar);
        Notification a9 = vVar.a();
        h.d(a9, "build(...)");
        return a9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x01df, code lost:
    
        if (r8.getAndroidId() == r15.getAndroidId()) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x022a A[EDGE_INSN: B:33:0x022a->B:34:0x022a BREAK  A[LOOP:0: B:13:0x01bf->B:29:0x0222], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // v5.InterfaceC5117c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createSummaryNotification(t5.d dVar, b.a aVar, int i, InterfaceC5267d interfaceC5267d) {
        b bVar;
        int i6;
        String optString;
        t5.d dVar2;
        b.a aVar2;
        int i9;
        JSONObject jSONObject;
        boolean z3;
        PendingIntent pendingIntent;
        com.onesignal.notifications.internal.display.impl.a aVar3;
        SecureRandom secureRandom;
        d dVar3;
        Integer num;
        PendingIntent pendingIntent2;
        b.a aVar4;
        JSONObject jSONObject2;
        String str;
        t5.d dVar4;
        Integer num2;
        com.onesignal.notifications.internal.display.impl.a aVar5;
        SecureRandom secureRandom2;
        SecureRandom secureRandom3;
        t5.d dVar5;
        String str2;
        b.a aVar6;
        int i10;
        com.onesignal.notifications.internal.display.impl.a aVar7;
        Integer num3;
        boolean z6;
        d dVar6;
        int i11;
        b.a aVar8;
        Iterator it;
        boolean hasNext;
        String str3;
        PendingIntent newActionPendingIntent;
        Notification a9;
        String str4;
        String obj;
        Integer num4;
        if (interfaceC5267d instanceof b) {
            bVar = (b) interfaceC5267d;
            int i12 = bVar.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.label = i12 - Integer.MIN_VALUE;
                Object obj2 = bVar.result;
                A7.a aVar9 = A7.a.f58n;
                i6 = bVar.label;
                if (i6 != 0) {
                    com.bumptech.glide.d.k(obj2);
                    boolean isRestoring = dVar.isRestoring();
                    JSONObject jsonPayload = dVar.getJsonPayload();
                    h.b(jsonPayload);
                    Context currentContext = getCurrentContext();
                    h.b(currentContext);
                    com.onesignal.notifications.internal.display.impl.a aVar10 = new com.onesignal.notifications.internal.display.impl.a(currentContext);
                    optString = jsonPayload.optString("grp", null);
                    SecureRandom secureRandom4 = new SecureRandom();
                    InterfaceC5115a interfaceC5115a = this._notificationDisplayBuilder;
                    int nextInt = secureRandom4.nextInt();
                    Intent putExtra = this._notificationDisplayBuilder.getNewBaseDismissIntent(0).putExtra("summary", optString);
                    h.d(putExtra, "putExtra(...)");
                    PendingIntent newDismissActionPendingIntent = interfaceC5115a.getNewDismissActionPendingIntent(nextInt, putExtra);
                    u5.d dVar7 = this._dataController;
                    h.b(optString);
                    bVar.L$0 = this;
                    dVar2 = dVar;
                    bVar.L$1 = dVar2;
                    aVar2 = aVar;
                    bVar.L$2 = aVar2;
                    bVar.L$3 = jsonPayload;
                    bVar.L$4 = aVar10;
                    bVar.L$5 = optString;
                    bVar.L$6 = secureRandom4;
                    bVar.L$7 = newDismissActionPendingIntent;
                    i9 = i;
                    bVar.I$0 = i9;
                    bVar.Z$0 = isRestoring;
                    bVar.label = 1;
                    Object androidIdForGroup = dVar7.getAndroidIdForGroup(optString, true, bVar);
                    if (androidIdForGroup != aVar9) {
                        jSONObject = jsonPayload;
                        z3 = isRestoring;
                        obj2 = androidIdForGroup;
                        pendingIntent = newDismissActionPendingIntent;
                        aVar3 = aVar10;
                        secureRandom = secureRandom4;
                        dVar3 = this;
                    }
                    return aVar9;
                }
                if (i6 != 1) {
                    if (i6 == 2) {
                        z3 = bVar.Z$0;
                        i10 = bVar.I$0;
                        num3 = (Integer) bVar.L$8;
                        pendingIntent = (PendingIntent) bVar.L$7;
                        secureRandom3 = (SecureRandom) bVar.L$6;
                        str2 = (String) bVar.L$5;
                        aVar7 = (com.onesignal.notifications.internal.display.impl.a) bVar.L$4;
                        jSONObject = (JSONObject) bVar.L$3;
                        aVar6 = (b.a) bVar.L$2;
                        dVar5 = (t5.d) bVar.L$1;
                        dVar3 = (d) bVar.L$0;
                        com.bumptech.glide.d.k(obj2);
                        aVar4 = aVar6;
                        num2 = num3;
                        secureRandom2 = secureRandom3;
                        aVar5 = aVar7;
                        i9 = i10;
                        pendingIntent2 = pendingIntent;
                        str = str2;
                        jSONObject2 = jSONObject;
                        dVar4 = dVar5;
                        u5.d dVar8 = dVar3._dataController;
                        h.b(str);
                        bVar.L$0 = dVar3;
                        bVar.L$1 = dVar4;
                        bVar.L$2 = aVar4;
                        bVar.L$3 = jSONObject2;
                        bVar.L$4 = aVar5;
                        bVar.L$5 = str;
                        bVar.L$6 = secureRandom2;
                        bVar.L$7 = pendingIntent2;
                        bVar.L$8 = num2;
                        bVar.I$0 = i9;
                        bVar.Z$0 = z3;
                        bVar.label = 3;
                        obj2 = dVar8.listNotificationsForGroup(str, bVar);
                        if (obj2 != aVar9) {
                            z6 = z3;
                            dVar6 = dVar3;
                            i11 = i9;
                            aVar8 = aVar4;
                            ArrayList arrayList = new ArrayList();
                            it = ((List) obj2).iterator();
                            String str5 = null;
                            while (true) {
                                hasNext = it.hasNext();
                                Iterator it2 = it;
                                str3 = "";
                                if (hasNext) {
                                }
                                num2 = num4;
                            }
                            Integer num5 = num2;
                            int nextInt2 = secureRandom2.nextInt();
                            h.b(num5);
                            int intValue = num5.intValue();
                            h.b(str);
                            newActionPendingIntent = aVar5.getNewActionPendingIntent(nextInt2, dVar6.createBaseSummaryIntent(intValue, aVar5, jSONObject2, str));
                            if (z6 != 0) {
                            }
                            h.b(aVar8);
                            v compatBuilder = aVar8.getCompatBuilder();
                            h.b(compatBuilder);
                            compatBuilder.f495b.clear();
                            dVar6._notificationDisplayBuilder.addNotificationActionButtons(jSONObject2, aVar5, compatBuilder, num5.intValue(), str);
                            compatBuilder.f500g = newActionPendingIntent;
                            compatBuilder.f514v.deleteIntent = pendingIntent2;
                            compatBuilder.d(8, z6);
                            compatBuilder.d(16, false);
                            compatBuilder.f505m = str;
                            compatBuilder.f506n = true;
                            compatBuilder.f512t = i11;
                            a9 = compatBuilder.a();
                            h.d(a9, "build(...)");
                            dVar6._notificationDisplayBuilder.addXiaomiSettings(aVar8, a9);
                            Context currentContext2 = dVar6.getCurrentContext();
                            h.b(currentContext2);
                            new N(currentContext2).a(num5.intValue(), a9);
                            return u7.v.f41350a;
                        }
                        return aVar9;
                    }
                    if (i6 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z9 = bVar.Z$0;
                    i11 = bVar.I$0;
                    num2 = (Integer) bVar.L$8;
                    pendingIntent2 = (PendingIntent) bVar.L$7;
                    secureRandom2 = (SecureRandom) bVar.L$6;
                    str = (String) bVar.L$5;
                    aVar5 = (com.onesignal.notifications.internal.display.impl.a) bVar.L$4;
                    jSONObject2 = (JSONObject) bVar.L$3;
                    aVar8 = (b.a) bVar.L$2;
                    dVar4 = (t5.d) bVar.L$1;
                    dVar6 = (d) bVar.L$0;
                    com.bumptech.glide.d.k(obj2);
                    z6 = z9;
                    ArrayList arrayList2 = new ArrayList();
                    it = ((List) obj2).iterator();
                    String str52 = null;
                    while (true) {
                        hasNext = it.hasNext();
                        Iterator it22 = it;
                        str3 = "";
                        if (hasNext) {
                            break;
                        }
                        C5082c c5082c = (C5082c) it22.next();
                        String str6 = str52;
                        if (z6 == 0) {
                            num4 = num2;
                        } else {
                            num4 = num2;
                        }
                        String title = c5082c.getTitle();
                        str3 = title != null ? title.concat(" ") : "";
                        StringBuilder b9 = AbstractC5049e.b(str3);
                        b9.append(c5082c.getMessage());
                        SpannableString spannableString = new SpannableString(b9.toString());
                        if (str3.length() > 0) {
                            spannableString.setSpan(new StyleSpan(1), 0, str3.length(), 0);
                        }
                        arrayList2.add(spannableString);
                        if (str6 == null) {
                            str52 = c5082c.getFullData();
                            it = it22;
                            num2 = num4;
                        }
                        it = it22;
                        str52 = str6;
                        num2 = num4;
                    }
                    Integer num52 = num2;
                    int nextInt22 = secureRandom2.nextInt();
                    h.b(num52);
                    int intValue2 = num52.intValue();
                    h.b(str);
                    newActionPendingIntent = aVar5.getNewActionPendingIntent(nextInt22, dVar6.createBaseSummaryIntent(intValue2, aVar5, jSONObject2, str));
                    if ((z6 != 0 || arrayList2.size() <= 1) && (z6 != 0 || arrayList2.size() <= 0)) {
                        h.b(aVar8);
                        v compatBuilder2 = aVar8.getCompatBuilder();
                        h.b(compatBuilder2);
                        compatBuilder2.f495b.clear();
                        dVar6._notificationDisplayBuilder.addNotificationActionButtons(jSONObject2, aVar5, compatBuilder2, num52.intValue(), str);
                        compatBuilder2.f500g = newActionPendingIntent;
                        compatBuilder2.f514v.deleteIntent = pendingIntent2;
                        compatBuilder2.d(8, z6);
                        compatBuilder2.d(16, false);
                        compatBuilder2.f505m = str;
                        compatBuilder2.f506n = true;
                        try {
                            compatBuilder2.f512t = i11;
                        } catch (Throwable unused) {
                        }
                        a9 = compatBuilder2.a();
                        h.d(a9, "build(...)");
                        dVar6._notificationDisplayBuilder.addXiaomiSettings(aVar8, a9);
                    } else {
                        int size = arrayList2.size() + (!z6);
                        String safeString = com.onesignal.common.e.safeString(jSONObject2, "grp_msg");
                        if (safeString != null) {
                            str4 = q.P(safeString, "$[notif_count]", "" + size);
                        } else {
                            str4 = size + " new messages";
                        }
                        v compatBuilder3 = dVar6._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(dVar4).getCompatBuilder();
                        if (z6 != 0) {
                            dVar6._notificationDisplayBuilder.removeNotifyOptions(compatBuilder3);
                        } else {
                            if (dVar4.getOverriddenSound() != null) {
                                h.b(compatBuilder3);
                                compatBuilder3.f(dVar4.getOverriddenSound());
                            }
                            if (dVar4.getOverriddenFlags() != null) {
                                h.b(compatBuilder3);
                                Integer overriddenFlags = dVar4.getOverriddenFlags();
                                h.b(overriddenFlags);
                                compatBuilder3.c(overriddenFlags.intValue());
                            }
                        }
                        h.b(compatBuilder3);
                        compatBuilder3.f500g = newActionPendingIntent;
                        compatBuilder3.f514v.deleteIntent = pendingIntent2;
                        Context currentContext3 = dVar6.getCurrentContext();
                        h.b(currentContext3);
                        PackageManager packageManager = currentContext3.getPackageManager();
                        Context currentContext4 = dVar6.getCurrentContext();
                        h.b(currentContext4);
                        compatBuilder3.f498e = v.b(packageManager.getApplicationLabel(currentContext4.getApplicationInfo()));
                        compatBuilder3.f499f = v.b(str4);
                        compatBuilder3.i = size;
                        compatBuilder3.f514v.icon = dVar6._notificationDisplayBuilder.getDefaultSmallIconId();
                        compatBuilder3.e(dVar6._notificationDisplayBuilder.getDefaultLargeIcon());
                        compatBuilder3.d(8, z6);
                        compatBuilder3.d(16, false);
                        compatBuilder3.f505m = str;
                        compatBuilder3.f506n = true;
                        try {
                            compatBuilder3.f512t = i11;
                        } catch (Throwable unused2) {
                        }
                        if (z6 == 0) {
                            compatBuilder3.f514v.tickerText = v.b(str4);
                        }
                        t tVar = new t(1);
                        if (z6 == 0) {
                            String valueOf = dVar4.getTitle() != null ? String.valueOf(dVar4.getTitle()) : null;
                            String concat = valueOf == null ? "" : valueOf.concat(" ");
                            CharSequence body = dVar4.getBody();
                            if (body != null && (obj = body.toString()) != null) {
                                str3 = obj;
                            }
                            SpannableString spannableString2 = new SpannableString(AbstractC4404f.f(concat, str3));
                            if (concat.length() > 0) {
                                spannableString2.setSpan(new StyleSpan(1), 0, concat.length(), 0);
                            }
                            ((ArrayList) tVar.f493f).add(v.b(spannableString2));
                        }
                        Iterator it3 = arrayList2.iterator();
                        while (it3.hasNext()) {
                            SpannableString spannableString3 = (SpannableString) it3.next();
                            if (spannableString3 != null) {
                                ((ArrayList) tVar.f493f).add(v.b(spannableString3));
                            }
                        }
                        tVar.f517b = v.b(str4);
                        compatBuilder3.g(tVar);
                        a9 = compatBuilder3.a();
                        h.d(a9, "build(...)");
                    }
                    Context currentContext22 = dVar6.getCurrentContext();
                    h.b(currentContext22);
                    new N(currentContext22).a(num52.intValue(), a9);
                    return u7.v.f41350a;
                }
                z3 = bVar.Z$0;
                int i13 = bVar.I$0;
                PendingIntent pendingIntent3 = (PendingIntent) bVar.L$7;
                SecureRandom secureRandom5 = (SecureRandom) bVar.L$6;
                String str7 = (String) bVar.L$5;
                com.onesignal.notifications.internal.display.impl.a aVar11 = (com.onesignal.notifications.internal.display.impl.a) bVar.L$4;
                JSONObject jSONObject3 = (JSONObject) bVar.L$3;
                aVar2 = (b.a) bVar.L$2;
                t5.d dVar9 = (t5.d) bVar.L$1;
                d dVar10 = (d) bVar.L$0;
                com.bumptech.glide.d.k(obj2);
                i9 = i13;
                secureRandom = secureRandom5;
                dVar3 = dVar10;
                jSONObject = jSONObject3;
                dVar2 = dVar9;
                pendingIntent = pendingIntent3;
                optString = str7;
                aVar3 = aVar11;
                num = (Integer) obj2;
                if (num == null) {
                    pendingIntent2 = pendingIntent;
                    aVar4 = aVar2;
                    jSONObject2 = jSONObject;
                    str = optString;
                    dVar4 = dVar2;
                    num2 = num;
                    aVar5 = aVar3;
                    secureRandom2 = secureRandom;
                    u5.d dVar82 = dVar3._dataController;
                    h.b(str);
                    bVar.L$0 = dVar3;
                    bVar.L$1 = dVar4;
                    bVar.L$2 = aVar4;
                    bVar.L$3 = jSONObject2;
                    bVar.L$4 = aVar5;
                    bVar.L$5 = str;
                    bVar.L$6 = secureRandom2;
                    bVar.L$7 = pendingIntent2;
                    bVar.L$8 = num2;
                    bVar.I$0 = i9;
                    bVar.Z$0 = z3;
                    bVar.label = 3;
                    obj2 = dVar82.listNotificationsForGroup(str, bVar);
                    if (obj2 != aVar9) {
                    }
                    return aVar9;
                }
                Integer num6 = new Integer(secureRandom.nextInt());
                u5.d dVar11 = dVar3._dataController;
                int intValue3 = num6.intValue();
                h.b(optString);
                bVar.L$0 = dVar3;
                bVar.L$1 = dVar2;
                bVar.L$2 = aVar2;
                bVar.L$3 = jSONObject;
                bVar.L$4 = aVar3;
                bVar.L$5 = optString;
                bVar.L$6 = secureRandom;
                bVar.L$7 = pendingIntent;
                bVar.L$8 = num6;
                bVar.I$0 = i9;
                bVar.Z$0 = z3;
                bVar.label = 2;
                if (dVar11.createSummaryNotification(intValue3, optString, bVar) != aVar9) {
                    t5.d dVar12 = dVar2;
                    secureRandom3 = secureRandom;
                    dVar5 = dVar12;
                    b.a aVar12 = aVar2;
                    str2 = optString;
                    aVar6 = aVar12;
                    i10 = i9;
                    aVar7 = aVar3;
                    num3 = num6;
                    aVar4 = aVar6;
                    num2 = num3;
                    secureRandom2 = secureRandom3;
                    aVar5 = aVar7;
                    i9 = i10;
                    pendingIntent2 = pendingIntent;
                    str = str2;
                    jSONObject2 = jSONObject;
                    dVar4 = dVar5;
                    u5.d dVar822 = dVar3._dataController;
                    h.b(str);
                    bVar.L$0 = dVar3;
                    bVar.L$1 = dVar4;
                    bVar.L$2 = aVar4;
                    bVar.L$3 = jSONObject2;
                    bVar.L$4 = aVar5;
                    bVar.L$5 = str;
                    bVar.L$6 = secureRandom2;
                    bVar.L$7 = pendingIntent2;
                    bVar.L$8 = num2;
                    bVar.I$0 = i9;
                    bVar.Z$0 = z3;
                    bVar.label = 3;
                    obj2 = dVar822.listNotificationsForGroup(str, bVar);
                    if (obj2 != aVar9) {
                    }
                }
                return aVar9;
            }
        }
        bVar = new b(interfaceC5267d);
        Object obj22 = bVar.result;
        A7.a aVar92 = A7.a.f58n;
        i6 = bVar.label;
        if (i6 != 0) {
        }
        num = (Integer) obj22;
        if (num == null) {
        }
    }

    @Override // v5.InterfaceC5117c
    public Object updateSummaryNotification(t5.d dVar, InterfaceC5267d interfaceC5267d) {
        Object createSummaryNotification = createSummaryNotification(dVar, null, this._notificationDisplayBuilder.getGroupAlertBehavior(), interfaceC5267d);
        return createSummaryNotification == A7.a.f58n ? createSummaryNotification : u7.v.f41350a;
    }
}
