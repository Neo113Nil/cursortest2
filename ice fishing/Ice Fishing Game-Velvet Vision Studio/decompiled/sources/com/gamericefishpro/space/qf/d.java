package com.gamericefishpro.space.qf;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import com.gamericefishpro.space.lc.f;
import com.gamericefishpro.space.mf.e;
import com.gamericefishpro.space.r3.g;
import com.gamericefishpro.space.r3.i;
import com.gamericefishpro.space.r3.p;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements com.gamericefishpro.space.pf.c {
    private final f _applicationService;
    private final com.gamericefishpro.space.nf.d _dataController;
    private final com.gamericefishpro.space.pf.a _notificationDisplayBuilder;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends com.gamericefishpro.space.vh.c {
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

        public a(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.createGrouplessSummaryNotification(null, null, 0, 0, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends com.gamericefishpro.space.vh.c {
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

        public b(com.gamericefishpro.space.th.a aVar) {
            super(aVar);
        }

        @Override // com.gamericefishpro.space.vh.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.createSummaryNotification(null, null, 0, this);
        }
    }

    public d(f _applicationService, com.gamericefishpro.space.nf.d _dataController, com.gamericefishpro.space.pf.a _notificationDisplayBuilder) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_dataController, "_dataController");
        Intrinsics.checkNotNullParameter(_notificationDisplayBuilder, "_notificationDisplayBuilder");
        this._applicationService = _applicationService;
        this._dataController = _dataController;
        this._notificationDisplayBuilder = _notificationDisplayBuilder;
    }

    private final Intent createBaseSummaryIntent(int i, com.gamericefishpro.space.qf.a aVar, JSONObject jSONObject, String str) {
        Intent intentPutExtra = aVar.getNewBaseIntent(i).putExtra("onesignalData", jSONObject.toString()).putExtra("summary", str);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        return intentPutExtra;
    }

    private final Context getCurrentContext() {
        return this._applicationService.getAppContext();
    }

    @Override // com.gamericefishpro.space.pf.c
    public void createGenericPendingIntentsForGroup(i iVar, com.gamericefishpro.space.qf.a intentGenerator, JSONObject gcmBundle, String group, int i) {
        Intrinsics.checkNotNullParameter(intentGenerator, "intentGenerator");
        Intrinsics.checkNotNullParameter(gcmBundle, "gcmBundle");
        Intrinsics.checkNotNullParameter(group, "group");
        SecureRandom secureRandom = new SecureRandom();
        int iNextInt = secureRandom.nextInt();
        Intent intentPutExtra = intentGenerator.getNewBaseIntent(i).putExtra("onesignalData", gcmBundle.toString()).putExtra("grp", group);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        PendingIntent newActionPendingIntent = intentGenerator.getNewActionPendingIntent(iNextInt, intentPutExtra);
        Intrinsics.b(iVar);
        iVar.g = newActionPendingIntent;
        com.gamericefishpro.space.pf.a aVar = this._notificationDisplayBuilder;
        int iNextInt2 = secureRandom.nextInt();
        Intent intentPutExtra2 = this._notificationDisplayBuilder.getNewBaseDismissIntent(i).putExtra("grp", group);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra2, "putExtra(...)");
        iVar.v.deleteIntent = aVar.getNewDismissActionPendingIntent(iNextInt2, intentPutExtra2);
        iVar.m = group;
        try {
            iVar.t = this._notificationDisplayBuilder.getGroupAlertBehavior();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.gamericefishpro.space.pf.c
    public Object createGrouplessSummaryNotification(com.gamericefishpro.space.mf.d dVar, com.gamericefishpro.space.qf.a aVar, int i, int i2, com.gamericefishpro.space.th.a aVar2) {
        a aVar3;
        JSONObject jsonPayload;
        SecureRandom secureRandom;
        String str;
        d dVar2;
        String str2;
        com.gamericefishpro.space.mf.d dVar3;
        int i3;
        if (aVar2 instanceof a) {
            aVar3 = (a) aVar2;
            int i4 = aVar3.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                aVar3.label = i4 - Integer.MIN_VALUE;
            } else {
                aVar3 = new a(aVar2);
            }
        } else {
            aVar3 = new a(aVar2);
        }
        Object obj = aVar3.result;
        com.gamericefishpro.space.uh.a aVar4 = com.gamericefishpro.space.uh.a.d;
        int i5 = aVar3.label;
        if (i5 == 0) {
            com.gamericefishpro.space.wa.b.P(obj);
            jsonPayload = dVar.getJsonPayload();
            Intrinsics.b(jsonPayload);
            secureRandom = new SecureRandom();
            str = i + " new messages";
            com.gamericefishpro.space.nf.d dVar4 = this._dataController;
            aVar3.L$0 = this;
            aVar3.L$1 = dVar;
            aVar3.L$2 = aVar;
            aVar3.L$3 = jsonPayload;
            aVar3.L$4 = secureRandom;
            aVar3.L$5 = e.GROUPLESS_SUMMARY_KEY;
            aVar3.L$6 = str;
            aVar3.I$0 = i;
            aVar3.I$1 = i2;
            aVar3.I$2 = e.GROUPLESS_SUMMARY_ID;
            aVar3.label = 1;
            if (dVar4.createSummaryNotification(e.GROUPLESS_SUMMARY_ID, e.GROUPLESS_SUMMARY_KEY, aVar3) == aVar4) {
                return aVar4;
            }
            dVar2 = this;
            str2 = e.GROUPLESS_SUMMARY_KEY;
            dVar3 = dVar;
            i3 = -718463522;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i3 = aVar3.I$2;
            i2 = aVar3.I$1;
            i = aVar3.I$0;
            String str3 = (String) aVar3.L$6;
            str2 = (String) aVar3.L$5;
            secureRandom = (SecureRandom) aVar3.L$4;
            jsonPayload = (JSONObject) aVar3.L$3;
            com.gamericefishpro.space.qf.a aVar5 = (com.gamericefishpro.space.qf.a) aVar3.L$2;
            dVar3 = (com.gamericefishpro.space.mf.d) aVar3.L$1;
            dVar2 = (d) aVar3.L$0;
            com.gamericefishpro.space.wa.b.P(obj);
            str = str3;
            aVar = aVar5;
        }
        PendingIntent newActionPendingIntent = aVar.getNewActionPendingIntent(secureRandom.nextInt(), dVar2.createBaseSummaryIntent(i3, aVar, jsonPayload, str2));
        com.gamericefishpro.space.pf.a aVar6 = dVar2._notificationDisplayBuilder;
        int iNextInt = secureRandom.nextInt();
        Intent intentPutExtra = dVar2._notificationDisplayBuilder.getNewBaseDismissIntent(0).putExtra("summary", str2);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        PendingIntent newDismissActionPendingIntent = aVar6.getNewDismissActionPendingIntent(iNextInt, intentPutExtra);
        i compatBuilder = dVar2._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(dVar3).getCompatBuilder();
        if (dVar3.getOverriddenSound() != null) {
            Intrinsics.b(compatBuilder);
            compatBuilder.f(dVar3.getOverriddenSound());
        }
        if (dVar3.getOverriddenFlags() != null) {
            Intrinsics.b(compatBuilder);
            Integer overriddenFlags = dVar3.getOverriddenFlags();
            Intrinsics.b(overriddenFlags);
            compatBuilder.c(overriddenFlags.intValue());
        }
        Intrinsics.b(compatBuilder);
        compatBuilder.g = newActionPendingIntent;
        compatBuilder.v.deleteIntent = newDismissActionPendingIntent;
        Context currentContext = dVar2.getCurrentContext();
        Intrinsics.b(currentContext);
        PackageManager packageManager = currentContext.getPackageManager();
        Context currentContext2 = dVar2.getCurrentContext();
        Intrinsics.b(currentContext2);
        compatBuilder.e = i.b(packageManager.getApplicationLabel(currentContext2.getApplicationInfo()));
        compatBuilder.f = i.b(str);
        compatBuilder.i = i;
        compatBuilder.v.icon = dVar2._notificationDisplayBuilder.getDefaultSmallIconId();
        compatBuilder.e(dVar2._notificationDisplayBuilder.getDefaultLargeIcon());
        compatBuilder.d(8, true);
        compatBuilder.d(16, false);
        compatBuilder.m = str2;
        compatBuilder.n = true;
        try {
            compatBuilder.t = i2;
        } catch (Throwable unused) {
        }
        g gVar = new g(1);
        gVar.b = i.b(str);
        compatBuilder.g(gVar);
        Notification notificationA = compatBuilder.a();
        Intrinsics.checkNotNullExpressionValue(notificationA, "build(...)");
        Context currentContext3 = dVar2.getCurrentContext();
        Intrinsics.b(currentContext3);
        new p(currentContext3).a(i3, notificationA);
        return Unit.a;
    }

    @Override // com.gamericefishpro.space.pf.c
    public Notification createSingleNotificationBeforeSummaryBuilder(com.gamericefishpro.space.mf.d notificationJob, i iVar) {
        Intrinsics.checkNotNullParameter(notificationJob, "notificationJob");
        Intrinsics.b(iVar);
        Notification notificationA = iVar.a();
        Intrinsics.checkNotNullExpressionValue(notificationA, "build(...)");
        return notificationA;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x0229 A[EDGE_INSN: B:115:0x0229->B:54:0x0229 BREAK  A[LOOP:0: B:35:0x01b8->B:119:0x01b8], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:37:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:39:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:42:0x01db  */
    /* JADX WARN: Code duplicated, block: B:46:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:49:0x0206  */
    /* JADX WARN: Code duplicated, block: B:56:0x0245  */
    /* JADX WARN: Code duplicated, block: B:58:0x024c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x0277  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Instruction removed from duplicated block: B:65:0x0277, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.gamericefishpro.space.pf.c
    public Object createSummaryNotification(com.gamericefishpro.space.mf.d dVar, com.gamericefishpro.space.qf.b.a aVar, int i, com.gamericefishpro.space.th.a aVar2) {
        b bVar;
        com.gamericefishpro.space.qf.a aVar3;
        SecureRandom secureRandom;
        com.gamericefishpro.space.mf.d dVar2;
        com.gamericefishpro.space.qf.b.a aVar4;
        int i2;
        JSONObject jSONObject;
        boolean z;
        PendingIntent pendingIntent;
        String str;
        d dVar3;
        PendingIntent pendingIntent2;
        com.gamericefishpro.space.qf.b.a aVar5;
        JSONObject jSONObject2;
        String str2;
        com.gamericefishpro.space.mf.d dVar4;
        com.gamericefishpro.space.qf.a aVar6;
        SecureRandom secureRandom2;
        Integer num;
        SecureRandom secureRandom3;
        com.gamericefishpro.space.mf.d dVar5;
        int i3;
        com.gamericefishpro.space.qf.a aVar7;
        com.gamericefishpro.space.qf.b.a aVar8;
        String str3;
        Integer num2;
        boolean z2;
        d dVar6;
        int i4;
        com.gamericefishpro.space.qf.b.a aVar9;
        ArrayList arrayList;
        Iterator it;
        String fullData;
        boolean zHasNext;
        String strConcat;
        Integer num3;
        PendingIntent newActionPendingIntent;
        Notification notificationA;
        String strI;
        String string;
        com.gamericefishpro.space.nf.c cVar;
        String str4;
        SpannableString spannableString;
        if (aVar2 instanceof b) {
            bVar = (b) aVar2;
            int i5 = bVar.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                bVar.label = i5 - Integer.MIN_VALUE;
            } else {
                bVar = new b(aVar2);
            }
        } else {
            bVar = new b(aVar2);
        }
        Object objListNotificationsForGroup = bVar.result;
        com.gamericefishpro.space.uh.a aVar10 = com.gamericefishpro.space.uh.a.d;
        int i6 = bVar.label;
        if (i6 == 0) {
            com.gamericefishpro.space.wa.b.P(objListNotificationsForGroup);
            boolean zIsRestoring = dVar.isRestoring();
            JSONObject jsonPayload = dVar.getJsonPayload();
            Intrinsics.b(jsonPayload);
            Context currentContext = getCurrentContext();
            Intrinsics.b(currentContext);
            aVar3 = new com.gamericefishpro.space.qf.a(currentContext);
            String strOptString = jsonPayload.optString("grp", null);
            secureRandom = new SecureRandom();
            com.gamericefishpro.space.pf.a aVar11 = this._notificationDisplayBuilder;
            int iNextInt = secureRandom.nextInt();
            Intent intentPutExtra = this._notificationDisplayBuilder.getNewBaseDismissIntent(0).putExtra("summary", strOptString);
            Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
            PendingIntent newDismissActionPendingIntent = aVar11.getNewDismissActionPendingIntent(iNextInt, intentPutExtra);
            com.gamericefishpro.space.nf.d dVar7 = this._dataController;
            Intrinsics.b(strOptString);
            bVar.L$0 = this;
            dVar2 = dVar;
            bVar.L$1 = dVar2;
            aVar4 = aVar;
            bVar.L$2 = aVar4;
            bVar.L$3 = jsonPayload;
            bVar.L$4 = aVar3;
            bVar.L$5 = strOptString;
            bVar.L$6 = secureRandom;
            bVar.L$7 = newDismissActionPendingIntent;
            i2 = i;
            bVar.I$0 = i2;
            bVar.Z$0 = zIsRestoring;
            bVar.label = 1;
            Object androidIdForGroup = dVar7.getAndroidIdForGroup(strOptString, true, bVar);
            if (androidIdForGroup != aVar10) {
                jSONObject = jsonPayload;
                z = zIsRestoring;
                objListNotificationsForGroup = androidIdForGroup;
                pendingIntent = newDismissActionPendingIntent;
                str = strOptString;
                dVar3 = this;
            }
            return aVar10;
        }
        if (i6 == 1) {
            z = bVar.Z$0;
            int i7 = bVar.I$0;
            PendingIntent pendingIntent3 = (PendingIntent) bVar.L$7;
            secureRandom = (SecureRandom) bVar.L$6;
            str = (String) bVar.L$5;
            com.gamericefishpro.space.qf.a aVar12 = (com.gamericefishpro.space.qf.a) bVar.L$4;
            JSONObject jSONObject3 = (JSONObject) bVar.L$3;
            aVar4 = (com.gamericefishpro.space.qf.b.a) bVar.L$2;
            com.gamericefishpro.space.mf.d dVar8 = (com.gamericefishpro.space.mf.d) bVar.L$1;
            d dVar9 = (d) bVar.L$0;
            com.gamericefishpro.space.wa.b.P(objListNotificationsForGroup);
            i2 = i7;
            aVar3 = aVar12;
            pendingIntent = pendingIntent3;
            dVar3 = dVar9;
            jSONObject = jSONObject3;
            dVar2 = dVar8;
        } else {
            if (i6 == 2) {
                z = bVar.Z$0;
                i3 = bVar.I$0;
                num2 = (Integer) bVar.L$8;
                pendingIntent = (PendingIntent) bVar.L$7;
                secureRandom3 = (SecureRandom) bVar.L$6;
                str3 = (String) bVar.L$5;
                aVar7 = (com.gamericefishpro.space.qf.a) bVar.L$4;
                jSONObject = (JSONObject) bVar.L$3;
                aVar8 = (com.gamericefishpro.space.qf.b.a) bVar.L$2;
                dVar5 = (com.gamericefishpro.space.mf.d) bVar.L$1;
                dVar3 = (d) bVar.L$0;
                com.gamericefishpro.space.wa.b.P(objListNotificationsForGroup);
                aVar5 = aVar8;
                num = num2;
                secureRandom2 = secureRandom3;
                aVar6 = aVar7;
                i2 = i3;
                pendingIntent2 = pendingIntent;
                str2 = str3;
                jSONObject2 = jSONObject;
                dVar4 = dVar5;
                com.gamericefishpro.space.nf.d dVar10 = dVar3._dataController;
                Intrinsics.b(str2);
                bVar.L$0 = dVar3;
                bVar.L$1 = dVar4;
                bVar.L$2 = aVar5;
                bVar.L$3 = jSONObject2;
                bVar.L$4 = aVar6;
                bVar.L$5 = str2;
                bVar.L$6 = secureRandom2;
                bVar.L$7 = pendingIntent2;
                bVar.L$8 = num;
                bVar.I$0 = i2;
                bVar.Z$0 = z;
                bVar.label = 3;
                objListNotificationsForGroup = dVar10.listNotificationsForGroup(str2, bVar);
                if (objListNotificationsForGroup != aVar10) {
                    z2 = z;
                    dVar6 = dVar3;
                    i4 = i2;
                    aVar9 = aVar5;
                }
                return aVar10;
            }
            if (i6 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z3 = bVar.Z$0;
            i4 = bVar.I$0;
            num = (Integer) bVar.L$8;
            pendingIntent2 = (PendingIntent) bVar.L$7;
            secureRandom2 = (SecureRandom) bVar.L$6;
            str2 = (String) bVar.L$5;
            aVar6 = (com.gamericefishpro.space.qf.a) bVar.L$4;
            jSONObject2 = (JSONObject) bVar.L$3;
            aVar9 = (com.gamericefishpro.space.qf.b.a) bVar.L$2;
            dVar4 = (com.gamericefishpro.space.mf.d) bVar.L$1;
            dVar6 = (d) bVar.L$0;
            com.gamericefishpro.space.wa.b.P(objListNotificationsForGroup);
            z2 = z3;
        }
        arrayList = new ArrayList();
        it = ((List) objListNotificationsForGroup).iterator();
        fullData = null;
        while (true) {
            zHasNext = it.hasNext();
            it = it;
            strConcat = "";
            if (!zHasNext) {
                break;
            }
            cVar = (com.gamericefishpro.space.nf.c) it.next();
            num = num;
            if (z2 == 0) {
                str4 = fullData;
                if (cVar.getAndroidId() == dVar4.getAndroidId()) {
                }
            } else {
                str4 = fullData;
            }
            String title = cVar.getTitle();
            strConcat = title != null ? title.concat(" ") : "";
            spannableString = new SpannableString(strConcat + cVar.getMessage());
            if (strConcat.length() > 0) {
                spannableString.setSpan(new StyleSpan(1), 0, strConcat.length(), 0);
            }
            arrayList.add(spannableString);
            fullData = str4 == null ? cVar.getFullData() : str4;
        }
        num3 = num;
        int iNextInt2 = secureRandom2.nextInt();
        Intrinsics.b(num3);
        int iIntValue = num3.intValue();
        Intrinsics.b(str2);
        newActionPendingIntent = aVar6.getNewActionPendingIntent(iNextInt2, dVar6.createBaseSummaryIntent(iIntValue, aVar6, jSONObject2, str2));
        if ((z2 != 0 || arrayList.size() <= 1) && (z2 != 0 || arrayList.size() <= 0)) {
            Intrinsics.b(aVar9);
            i compatBuilder = aVar9.getCompatBuilder();
            Intrinsics.b(compatBuilder);
            compatBuilder.b.clear();
            dVar6._notificationDisplayBuilder.addNotificationActionButtons(jSONObject2, aVar6, compatBuilder, num3.intValue(), str2);
            compatBuilder.g = newActionPendingIntent;
            compatBuilder.v.deleteIntent = pendingIntent2;
            compatBuilder.d(8, z2);
            compatBuilder.d(16, false);
            compatBuilder.m = str2;
            compatBuilder.n = true;
            try {
                compatBuilder.t = i4;
            } catch (Throwable unused) {
            }
            notificationA = compatBuilder.a();
            Intrinsics.checkNotNullExpressionValue(notificationA, "build(...)");
            dVar6._notificationDisplayBuilder.addXiaomiSettings(aVar9, notificationA);
        } else {
            int size = arrayList.size() + (!z2);
            String strSafeString = com.gamericefishpro.space.yb.d.safeString(jSONObject2, "grp_msg");
            if (strSafeString != null) {
                strI = kotlin.text.d.i(strSafeString, "$[notif_count]", "" + size);
                if (strI == null) {
                    strI = size + " new messages";
                }
            } else {
                strI = size + " new messages";
            }
            i compatBuilder2 = dVar6._notificationDisplayBuilder.getBaseOneSignalNotificationBuilder(dVar4).getCompatBuilder();
            if (z2 != 0) {
                dVar6._notificationDisplayBuilder.removeNotifyOptions(compatBuilder2);
            } else {
                if (dVar4.getOverriddenSound() != null) {
                    Intrinsics.b(compatBuilder2);
                    compatBuilder2.f(dVar4.getOverriddenSound());
                }
                if (dVar4.getOverriddenFlags() != null) {
                    Intrinsics.b(compatBuilder2);
                    Integer overriddenFlags = dVar4.getOverriddenFlags();
                    Intrinsics.b(overriddenFlags);
                    compatBuilder2.c(overriddenFlags.intValue());
                }
            }
            Intrinsics.b(compatBuilder2);
            compatBuilder2.g = newActionPendingIntent;
            compatBuilder2.v.deleteIntent = pendingIntent2;
            Context currentContext2 = dVar6.getCurrentContext();
            Intrinsics.b(currentContext2);
            PackageManager packageManager = currentContext2.getPackageManager();
            Context currentContext3 = dVar6.getCurrentContext();
            Intrinsics.b(currentContext3);
            compatBuilder2.e = i.b(packageManager.getApplicationLabel(currentContext3.getApplicationInfo()));
            compatBuilder2.f = i.b(strI);
            compatBuilder2.i = size;
            compatBuilder2.v.icon = dVar6._notificationDisplayBuilder.getDefaultSmallIconId();
            compatBuilder2.e(dVar6._notificationDisplayBuilder.getDefaultLargeIcon());
            compatBuilder2.d(8, z2);
            compatBuilder2.d(16, false);
            compatBuilder2.m = str2;
            compatBuilder2.n = true;
            try {
                compatBuilder2.t = i4;
            } catch (Throwable unused2) {
            }
            if (z2 == 0) {
                compatBuilder2.v.tickerText = i.b(strI);
            }
            g gVar = new g(1);
            if (z2 == 0) {
                String strValueOf = dVar4.getTitle() != null ? String.valueOf(dVar4.getTitle()) : null;
                String strConcat2 = strValueOf == null ? "" : strValueOf.concat(" ");
                CharSequence body = dVar4.getBody();
                if (body != null && (string = body.toString()) != null) {
                    strConcat = string;
                }
                SpannableString spannableString2 = new SpannableString(com.gamericefishpro.space.m5.a.h(strConcat2, strConcat));
                if (strConcat2.length() > 0) {
                    spannableString2.setSpan(new StyleSpan(1), 0, strConcat2.length(), 0);
                }
                ((ArrayList) gVar.f).add(i.b(spannableString2));
            }
            int size2 = arrayList.size();
            int i8 = 0;
            while (i8 < size2) {
                Object obj = arrayList.get(i8);
                i8++;
                SpannableString spannableString3 = (SpannableString) obj;
                if (spannableString3 != null) {
                    ((ArrayList) gVar.f).add(i.b(spannableString3));
                }
            }
            gVar.b = i.b(strI);
            compatBuilder2.g(gVar);
            notificationA = compatBuilder2.a();
            Intrinsics.checkNotNullExpressionValue(notificationA, "build(...)");
        }
        Context currentContext4 = dVar6.getCurrentContext();
        Intrinsics.b(currentContext4);
        new p(currentContext4).a(num3.intValue(), notificationA);
        return Unit.a;
        Integer num4 = (Integer) objListNotificationsForGroup;
        if (num4 == null) {
            Integer num5 = new Integer(secureRandom.nextInt());
            com.gamericefishpro.space.nf.d dVar11 = dVar3._dataController;
            int iIntValue2 = num5.intValue();
            Intrinsics.b(str);
            bVar.L$0 = dVar3;
            bVar.L$1 = dVar2;
            bVar.L$2 = aVar4;
            bVar.L$3 = jSONObject;
            bVar.L$4 = aVar3;
            bVar.L$5 = str;
            bVar.L$6 = secureRandom;
            bVar.L$7 = pendingIntent;
            bVar.L$8 = num5;
            bVar.I$0 = i2;
            bVar.Z$0 = z;
            bVar.label = 2;
            if (dVar11.createSummaryNotification(iIntValue2, str, bVar) != aVar10) {
                com.gamericefishpro.space.mf.d dVar12 = dVar2;
                secureRandom3 = secureRandom;
                dVar5 = dVar12;
                i3 = i2;
                aVar7 = aVar3;
                aVar8 = aVar4;
                str3 = str;
                num2 = num5;
                aVar5 = aVar8;
                num = num2;
                secureRandom2 = secureRandom3;
                aVar6 = aVar7;
                i2 = i3;
                pendingIntent2 = pendingIntent;
                str2 = str3;
                jSONObject2 = jSONObject;
                dVar4 = dVar5;
                com.gamericefishpro.space.nf.d dVar13 = dVar3._dataController;
                Intrinsics.b(str2);
                bVar.L$0 = dVar3;
                bVar.L$1 = dVar4;
                bVar.L$2 = aVar5;
                bVar.L$3 = jSONObject2;
                bVar.L$4 = aVar6;
                bVar.L$5 = str2;
                bVar.L$6 = secureRandom2;
                bVar.L$7 = pendingIntent2;
                bVar.L$8 = num;
                bVar.I$0 = i2;
                bVar.Z$0 = z;
                bVar.label = 3;
                objListNotificationsForGroup = dVar13.listNotificationsForGroup(str2, bVar);
                if (objListNotificationsForGroup != aVar10) {
                    z2 = z;
                    dVar6 = dVar3;
                    i4 = i2;
                    aVar9 = aVar5;
                    arrayList = new ArrayList();
                    it = ((List) objListNotificationsForGroup).iterator();
                    fullData = null;
                    while (true) {
                        zHasNext = it.hasNext();
                        it = it;
                        strConcat = "";
                        if (!zHasNext) {
                            break;
                            break;
                        }
                        cVar = (com.gamericefishpro.space.nf.c) it.next();
                        num = num;
                        if (z2 == 0) {
                            str4 = fullData;
                            if (cVar.getAndroidId() == dVar4.getAndroidId()) {
                            }
                        } else {
                            str4 = fullData;
                        }
                        String title2 = cVar.getTitle();
                        if (title2 != null) {
                        }
                        spannableString = new SpannableString(strConcat + cVar.getMessage());
                        if (strConcat.length() > 0) {
                            spannableString.setSpan(new StyleSpan(1), 0, strConcat.length(), 0);
                        }
                        arrayList.add(spannableString);
                        if (str4 == null) {
                        }
                    }
                    num3 = num;
                    int iNextInt3 = secureRandom2.nextInt();
                    Intrinsics.b(num3);
                    int iIntValue3 = num3.intValue();
                    Intrinsics.b(str2);
                    newActionPendingIntent = aVar6.getNewActionPendingIntent(iNextInt3, dVar6.createBaseSummaryIntent(iIntValue3, aVar6, jSONObject2, str2));
                    if (z2 != 0) {
                        Intrinsics.b(aVar9);
                        i compatBuilder3 = aVar9.getCompatBuilder();
                        Intrinsics.b(compatBuilder3);
                        compatBuilder3.b.clear();
                        dVar6._notificationDisplayBuilder.addNotificationActionButtons(jSONObject2, aVar6, compatBuilder3, num3.intValue(), str2);
                        compatBuilder3.g = newActionPendingIntent;
                        compatBuilder3.v.deleteIntent = pendingIntent2;
                        compatBuilder3.d(8, z2);
                        compatBuilder3.d(16, false);
                        compatBuilder3.m = str2;
                        compatBuilder3.n = true;
                        compatBuilder3.t = i4;
                        notificationA = compatBuilder3.a();
                        Intrinsics.checkNotNullExpressionValue(notificationA, "build(...)");
                        dVar6._notificationDisplayBuilder.addXiaomiSettings(aVar9, notificationA);
                    } else {
                        Intrinsics.b(aVar9);
                        i compatBuilder4 = aVar9.getCompatBuilder();
                        Intrinsics.b(compatBuilder4);
                        compatBuilder4.b.clear();
                        dVar6._notificationDisplayBuilder.addNotificationActionButtons(jSONObject2, aVar6, compatBuilder4, num3.intValue(), str2);
                        compatBuilder4.g = newActionPendingIntent;
                        compatBuilder4.v.deleteIntent = pendingIntent2;
                        compatBuilder4.d(8, z2);
                        compatBuilder4.d(16, false);
                        compatBuilder4.m = str2;
                        compatBuilder4.n = true;
                        compatBuilder4.t = i4;
                        notificationA = compatBuilder4.a();
                        Intrinsics.checkNotNullExpressionValue(notificationA, "build(...)");
                        dVar6._notificationDisplayBuilder.addXiaomiSettings(aVar9, notificationA);
                    }
                    Context currentContext5 = dVar6.getCurrentContext();
                    Intrinsics.b(currentContext5);
                    new p(currentContext5).a(num3.intValue(), notificationA);
                    return Unit.a;
                }
            }
        } else {
            pendingIntent2 = pendingIntent;
            aVar5 = aVar4;
            jSONObject2 = jSONObject;
            str2 = str;
            dVar4 = dVar2;
            aVar6 = aVar3;
            secureRandom2 = secureRandom;
            num = num4;
            com.gamericefishpro.space.nf.d dVar14 = dVar3._dataController;
            Intrinsics.b(str2);
            bVar.L$0 = dVar3;
            bVar.L$1 = dVar4;
            bVar.L$2 = aVar5;
            bVar.L$3 = jSONObject2;
            bVar.L$4 = aVar6;
            bVar.L$5 = str2;
            bVar.L$6 = secureRandom2;
            bVar.L$7 = pendingIntent2;
            bVar.L$8 = num;
            bVar.I$0 = i2;
            bVar.Z$0 = z;
            bVar.label = 3;
            objListNotificationsForGroup = dVar14.listNotificationsForGroup(str2, bVar);
            if (objListNotificationsForGroup != aVar10) {
                z2 = z;
                dVar6 = dVar3;
                i4 = i2;
                aVar9 = aVar5;
                arrayList = new ArrayList();
                it = ((List) objListNotificationsForGroup).iterator();
                fullData = null;
                while (true) {
                    zHasNext = it.hasNext();
                    it = it;
                    strConcat = "";
                    if (!zHasNext) {
                        break;
                        break;
                    }
                    cVar = (com.gamericefishpro.space.nf.c) it.next();
                    num = num;
                    if (z2 == 0) {
                        str4 = fullData;
                        if (cVar.getAndroidId() == dVar4.getAndroidId()) {
                        }
                    } else {
                        str4 = fullData;
                    }
                    String title3 = cVar.getTitle();
                    if (title3 != null) {
                    }
                    spannableString = new SpannableString(strConcat + cVar.getMessage());
                    if (strConcat.length() > 0) {
                        spannableString.setSpan(new StyleSpan(1), 0, strConcat.length(), 0);
                    }
                    arrayList.add(spannableString);
                    if (str4 == null) {
                    }
                }
                num3 = num;
                int iNextInt4 = secureRandom2.nextInt();
                Intrinsics.b(num3);
                int iIntValue4 = num3.intValue();
                Intrinsics.b(str2);
                newActionPendingIntent = aVar6.getNewActionPendingIntent(iNextInt4, dVar6.createBaseSummaryIntent(iIntValue4, aVar6, jSONObject2, str2));
                if (z2 != 0) {
                    Intrinsics.b(aVar9);
                    i compatBuilder5 = aVar9.getCompatBuilder();
                    Intrinsics.b(compatBuilder5);
                    compatBuilder5.b.clear();
                    dVar6._notificationDisplayBuilder.addNotificationActionButtons(jSONObject2, aVar6, compatBuilder5, num3.intValue(), str2);
                    compatBuilder5.g = newActionPendingIntent;
                    compatBuilder5.v.deleteIntent = pendingIntent2;
                    compatBuilder5.d(8, z2);
                    compatBuilder5.d(16, false);
                    compatBuilder5.m = str2;
                    compatBuilder5.n = true;
                    compatBuilder5.t = i4;
                    notificationA = compatBuilder5.a();
                    Intrinsics.checkNotNullExpressionValue(notificationA, "build(...)");
                    dVar6._notificationDisplayBuilder.addXiaomiSettings(aVar9, notificationA);
                } else {
                    Intrinsics.b(aVar9);
                    i compatBuilder6 = aVar9.getCompatBuilder();
                    Intrinsics.b(compatBuilder6);
                    compatBuilder6.b.clear();
                    dVar6._notificationDisplayBuilder.addNotificationActionButtons(jSONObject2, aVar6, compatBuilder6, num3.intValue(), str2);
                    compatBuilder6.g = newActionPendingIntent;
                    compatBuilder6.v.deleteIntent = pendingIntent2;
                    compatBuilder6.d(8, z2);
                    compatBuilder6.d(16, false);
                    compatBuilder6.m = str2;
                    compatBuilder6.n = true;
                    compatBuilder6.t = i4;
                    notificationA = compatBuilder6.a();
                    Intrinsics.checkNotNullExpressionValue(notificationA, "build(...)");
                    dVar6._notificationDisplayBuilder.addXiaomiSettings(aVar9, notificationA);
                }
                Context currentContext6 = dVar6.getCurrentContext();
                Intrinsics.b(currentContext6);
                new p(currentContext6).a(num3.intValue(), notificationA);
                return Unit.a;
            }
        }
        return aVar10;
    }

    @Override // com.gamericefishpro.space.pf.c
    public Object updateSummaryNotification(com.gamericefishpro.space.mf.d dVar, com.gamericefishpro.space.th.a aVar) {
        Object objCreateSummaryNotification = createSummaryNotification(dVar, null, this._notificationDisplayBuilder.getGroupAlertBehavior(), aVar);
        return objCreateSummaryNotification == com.gamericefishpro.space.uh.a.d ? objCreateSummaryNotification : Unit.a;
    }
}
