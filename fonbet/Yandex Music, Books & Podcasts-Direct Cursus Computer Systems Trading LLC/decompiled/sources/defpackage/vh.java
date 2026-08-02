package defpackage;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.fragment.app.y;
import com.yandex.passport.api.a0;
import com.yandex.passport.api.exception.e;
import com.yandex.passport.api.exception.k;
import com.yandex.passport.api.exception.t;
import com.yandex.passport.api.impl.b;
import com.yandex.passport.api.l0;
import com.yandex.passport.api.q;
import com.yandex.passport.api.y1;
import com.yandex.passport.api.z;
import com.yandex.passport.api.z1;
import com.yandex.passport.internal.properties.i;
import com.yandex.passport.internal.properties.j;
import com.yandex.passport.internal.properties.l;
import com.yandex.passport.internal.properties.u;
import com.yandex.passport.internal.sloth.credentialmanager.RequestCredentialManagerActivity;
import com.yandex.passport.internal.social.esia.EsiaBindActivity;
import com.yandex.passport.internal.ui.bouncer.BouncerActivity;
import com.yandex.passport.internal.ui.bouncer.model.p1;
import com.yandex.passport.internal.ui.challenge.delete.DeleteAccountActivity;
import com.yandex.passport.internal.ui.challenge.delete.DeleteForeverActivity;
import com.yandex.passport.internal.ui.challenge.logout.LogoutActivity;
import com.yandex.passport.internal.ui.challenge.logout.LogoutComposeActivity;
import com.yandex.passport.internal.ui.challenge.logout.d;
import com.yandex.passport.internal.ui.challenge.vpn.VpnChallengeActivity;
import com.yandex.passport.internal.ui.domik.DomikActivity;
import com.yandex.passport.internal.ui.domik.r;
import com.yandex.passport.internal.ui.sloth.StandaloneSlothActivity;
import com.yandex.passport.internal.ui.sloth.StandaloneSlothComposeActivity;
import com.yandex.passport.internal.ui.sloth.authsdk.AuthSdkSlothActivity;
import com.yandex.passport.internal.ui.sloth.authsdk.AuthSdkSlothComposeActivity;
import com.yandex.passport.internal.ui.sloth.authsdk.c;
import com.yandex.passport.internal.ui.sloth.d0;
import com.yandex.passport.internal.ui.sloth.ebs.BiometricVerificationActivity;
import com.yandex.passport.internal.ui.sloth.ebs.f;
import com.yandex.passport.sloth.data.m;
import com.yandex.payment.sdk.ui.bind.BindCardActivity;
import com.yandex.payment.sdk.ui.payment.PaymentActivity;
import com.yandex.plus.core.network.api.utils.a;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.catalog.playlist.screen.PlaylistScreenActivity;

/* loaded from: classes.dex */
public final class vh extends uh {
    public final /* synthetic */ int a;

    public /* synthetic */ vh(int i) {
        this.a = i;
    }

    @Override // defpackage.uh
    public final Intent createIntent(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                context.getClass();
                str.getClass();
                Intent putExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                putExtra.getClass();
                return putExtra;
            case 1:
                esk eskVar = (esk) obj;
                context.getClass();
                eskVar.getClass();
                if (qdq.z()) {
                    Intent intent = new Intent("android.provider.action.PICK_IMAGES");
                    intent.setType(qdq.v(eskVar.a));
                    intent.putExtra("android.provider.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                    return intent;
                }
                if (context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112) == null) {
                    Intent intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                    intent2.setType(qdq.v(eskVar.a));
                    if (intent2.getType() != null) {
                        return intent2;
                    }
                    intent2.setType("*/*");
                    intent2.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                    return intent2;
                }
                ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
                if (resolveActivity == null) {
                    xq0.q("Required value was null.");
                    return null;
                }
                ActivityInfo activityInfo = resolveActivity.activityInfo;
                Intent intent3 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
                intent3.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent3.setType(qdq.v(eskVar.a));
                intent3.putExtra("androidx.activity.result.contract.extra.PICK_IMAGES_LAUNCH_TAB", 1);
                return intent3;
            case 2:
                String[] strArr = (String[]) obj;
                context.getClass();
                strArr.getClass();
                Intent putExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                putExtra2.getClass();
                return putExtra2;
            case 3:
                String str2 = (String) obj;
                context.getClass();
                str2.getClass();
                Intent putExtra3 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str2});
                putExtra3.getClass();
                return putExtra3;
            case 4:
                Intent intent4 = (Intent) obj;
                context.getClass();
                intent4.getClass();
                return intent4;
            case 5:
                sre sreVar = (sre) obj;
                context.getClass();
                sreVar.getClass();
                Intent putExtra4 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", sreVar);
                putExtra4.getClass();
                return putExtra4;
            case 6:
                Bundle bundle = (Bundle) obj;
                context.getClass();
                ugk ugkVar = bundle != null ? (ugk) bundle.getParcelable("com.yandex.payment.sdk.ui.network.extra.ENVIRONMENT") : null;
                jdk jdkVar = bundle != null ? (jdk) bundle.getParcelable("com.yandex.payment.sdk.ui.network.extra.PAYER_DATA") : null;
                pyh pyhVar = bundle != null ? (pyh) bundle.getParcelable("com.yandex.payment.sdk.ui.network.extra.MERCHANT_DATA") : null;
                ln lnVar = bundle != null ? (ln) bundle.getParcelable("com.yandex.payment.sdk.ui.extra.ADDITIONAL_SETTINGS") : null;
                if (ugkVar == null || jdkVar == null || pyhVar == null || lnVar == null) {
                    return new Intent();
                }
                Parcelable.Creator<ugk> creator = ugk.CREATOR;
                g86 g86Var = g86.b;
                Context applicationContext = context.getApplicationContext();
                if (applicationContext == null) {
                    xq0.x("Provide application context");
                    return null;
                }
                new xek(applicationContext, ugkVar, g86Var, x3i.b);
                ues uesVar = ksw.H(context) ? ls7.a : ls7.b;
                Context applicationContext2 = applicationContext.getApplicationContext();
                applicationContext2.getClass();
                ysn ysnVar = new ysn(applicationContext2, jdkVar, pyhVar, ugkVar, lnVar, g86Var, null);
                hmd.a = uesVar;
                shc.a = uesVar;
                Intent a = ysnVar.a(BindCardActivity.class, false);
                a.putExtra("EXTRA_IS_TRANSPORT_CARDS_FLOW", true);
                return a;
            case 7:
                sre sreVar2 = (sre) obj;
                Intent intent5 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent6 = sreVar2.b;
                if (intent6 != null && (bundleExtra = intent6.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent5.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent6.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent6.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = sreVar2.a;
                        intentSender.getClass();
                        sreVar2 = new sre(intentSender, null, sreVar2.c, sreVar2.d);
                    }
                }
                intent5.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", sreVar2);
                if (y.M(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent5);
                }
                return intent5;
            case 8:
                Bundle bundle2 = (Bundle) obj;
                context.getClass();
                ugk ugkVar2 = bundle2 != null ? (ugk) bundle2.getParcelable("com.yandex.payment.sdk.ui.network.extra.ENVIRONMENT") : null;
                jdk jdkVar2 = bundle2 != null ? (jdk) bundle2.getParcelable("com.yandex.payment.sdk.ui.network.extra.PAYER_DATA") : null;
                ln lnVar2 = bundle2 != null ? (ln) bundle2.getParcelable("com.yandex.payment.sdk.ui.extra.ADDITIONAL_SETTINGS") : null;
                ehk ehkVar = bundle2 != null ? (ehk) bundle2.getParcelable("com.yandex.payment.sdk.ui.network.extra.PAYMENT_TOKEN") : null;
                rfk rfkVar = bundle2 != null ? (rfk) bundle2.getParcelable("com.yandex.payment.sdk.ui.network.extra.SELECTED_METHOD") : null;
                pyh pyhVar2 = bundle2 != null ? (pyh) bundle2.getParcelable("com.yandex.payment.sdk.ui.network.extra.MERCHANT_DATA") : null;
                if (ugkVar2 == null || jdkVar2 == null || lnVar2 == null || ehkVar == null || rfkVar == null || pyhVar2 == null) {
                    return new Intent();
                }
                Parcelable.Creator<ugk> creator2 = ugk.CREATOR;
                g86 g86Var2 = g86.b;
                Context applicationContext3 = context.getApplicationContext();
                if (applicationContext3 == null) {
                    xq0.x("Provide application context");
                    return null;
                }
                new xek(applicationContext3, ugkVar2, g86Var2, x3i.b);
                ues uesVar2 = ksw.H(context) ? ls7.a : ls7.b;
                Context applicationContext4 = applicationContext3.getApplicationContext();
                applicationContext4.getClass();
                ysn ysnVar2 = new ysn(applicationContext4, jdkVar2, pyhVar2, ugkVar2, lnVar2, g86Var2, null);
                hmd.a = uesVar2;
                shc.a = uesVar2;
                Intent a2 = ysnVar2.a(PaymentActivity.class, false);
                a2.putExtra("com.yandex.payment.sdk.ui.network.extra.PAYMENT_TOKEN", ehkVar);
                a2.putExtra("com.yandex.payment.sdk.ui.network.extra.SELECTED_METHOD", rfkVar);
                a2.putExtra("EXTRA_IS_TRANSPORT_CARDS_FLOW", true);
                return a2;
            case 9:
                cvl cvlVar = (cvl) obj;
                context.getClass();
                cvlVar.getClass();
                int i = PlaylistScreenActivity.B0;
                Intent i2 = dxl.i(context, cvlVar, null, 56);
                sb.D(context instanceof np2 ? (np2) context : null, i2);
                return i2;
            case 10:
                Bundle bundle3 = (Bundle) obj;
                context.getClass();
                Serializable serializable = bundle3 != null ? bundle3.getSerializable("com.yandex.payment.sdk.ui.network.extra.CLASS_NAME") : null;
                serializable.getClass();
                Intent intent7 = new Intent(context, (Class<?>) serializable);
                intent7.putExtras(bundle3);
                return intent7;
            case 11:
                context.getClass();
                return ((e) obj).a;
            case 12:
                if (obj != null) {
                    throw new ClassCastException();
                }
                context.getClass();
                throw null;
            case 13:
                j jVar = (j) obj;
                context.getClass();
                jVar.getClass();
                int i3 = EsiaBindActivity.h;
                y1 y1Var = jVar.a;
                z1 z1Var = jVar.b;
                z1Var.getClass();
                b b = b.b(z1Var.a);
                b.getClass();
                j jVar2 = new j(y1Var, new z1(b, z1Var.b), jVar.c, jVar.d, jVar.e);
                Intent intent8 = new Intent(context, (Class<?>) EsiaBindActivity.class);
                Bundle bundle4 = new Bundle();
                bundle4.putParcelable("esia-bind-properties", jVar2);
                intent8.putExtras(bundle4);
                return intent8;
            case 14:
                if (obj != null) {
                    throw new ClassCastException();
                }
                context.getClass();
                throw null;
            case 15:
                context.getClass();
                ((Unit) obj).getClass();
                int i4 = RequestCredentialManagerActivity.a;
                return new Intent(context, (Class<?>) RequestCredentialManagerActivity.class);
            case 16:
                l lVar = (l) obj;
                context.getClass();
                lVar.getClass();
                int i5 = BouncerActivity.e;
                return com.yandex.plus.pay.ui.core.b.k(context, lVar);
            case 17:
                p1 p1Var = (p1) obj;
                context.getClass();
                p1Var.getClass();
                l lVar2 = p1Var.a;
                List list = p1Var.c;
                com.yandex.passport.internal.l lVar3 = p1Var.d;
                boolean z = p1Var.e;
                r rVar = p1Var.f;
                boolean z2 = p1Var.g;
                int i6 = DomikActivity.n;
                Intent intent9 = new Intent(context, (Class<?>) DomikActivity.class);
                intent9.putExtras(lVar2.t());
                intent9.putExtras(cxb.K(new Pair("master-accounts", new ArrayList(list))));
                if (lVar3 != null) {
                    intent9.putExtras(cxb.K(new Pair("master-account", lVar3)));
                }
                intent9.putExtra("current_account", (Parcelable) null);
                intent9.putExtra("is_relogin", z);
                intent9.putExtra("run_as_transparent", false);
                intent9.putExtra("extra_external_auth_request", rVar);
                intent9.putExtra("extra_force_native", z2);
                return intent9;
            case 18:
                com.yandex.passport.internal.properties.r rVar2 = (com.yandex.passport.internal.properties.r) obj;
                context.getClass();
                rVar2.getClass();
                Bundle[] bundleArr = {cxb.K(new Pair("passport-delete-account-properties", rVar2))};
                Bundle bundle5 = new Bundle();
                bundle5.putAll(bundleArr[0]);
                return vq2.A(context, DeleteAccountActivity.class, bundle5);
            case 19:
                vat vatVar = (vat) obj;
                context.getClass();
                vatVar.getClass();
                Object obj2 = vatVar.c;
                Object obj3 = vatVar.b;
                Object obj4 = vatVar.a;
                if (((Boolean) obj2).booleanValue()) {
                    int i7 = LogoutComposeActivity.a;
                    return a.n(context, (u) obj4, (d) obj3);
                }
                int i8 = LogoutActivity.f;
                return com.yandex.plus.core.locale.b.h(context, (u) obj4, (d) obj3);
            case 20:
                com.yandex.passport.internal.properties.r rVar3 = (com.yandex.passport.internal.properties.r) obj;
                context.getClass();
                rVar3.getClass();
                int i9 = DeleteForeverActivity.j;
                return com.yandex.plus.pay.ui.core.b.l(context, rVar3);
            case 21:
                com.yandex.passport.internal.properties.r rVar4 = (com.yandex.passport.internal.properties.r) obj;
                context.getClass();
                rVar4.getClass();
                int i10 = DeleteForeverActivity.j;
                return com.yandex.plus.pay.ui.core.b.l(context, rVar4);
            case 22:
                Pair pair = (Pair) obj;
                context.getClass();
                pair.getClass();
                int i11 = LogoutActivity.f;
                return com.yandex.plus.core.locale.b.h(context, (u) pair.a, (d) pair.b);
            case 23:
                Pair pair2 = (Pair) obj;
                context.getClass();
                pair2.getClass();
                int i12 = LogoutComposeActivity.a;
                return a.n(context, (u) pair2.a, (d) pair2.b);
            case 24:
                String str3 = (String) obj;
                context.getClass();
                str3.getClass();
                boolean z3 = VpnChallengeActivity.a;
                return com.yandex.plus.pay.ui.core.b.m(context, str3);
            case 25:
                m mVar = (m) obj;
                context.getClass();
                mVar.getClass();
                Bundle[] bundleArr2 = {mVar.t()};
                Bundle bundle6 = new Bundle();
                bundle6.putAll(bundleArr2[0]);
                return vq2.A(context, StandaloneSlothActivity.class, bundle6);
            case 26:
                d0 d0Var = (d0) obj;
                context.getClass();
                d0Var.getClass();
                Bundle[] bundleArr3 = {cxb.K(new Pair("StandaloneSlothProperties", d0Var))};
                Bundle bundle7 = new Bundle();
                bundle7.putAll(bundleArr3[0]);
                return vq2.A(context, StandaloneSlothComposeActivity.class, bundle7);
            case 27:
                m mVar2 = (m) obj;
                context.getClass();
                mVar2.getClass();
                Bundle[] bundleArr4 = {mVar2.t()};
                Bundle bundle8 = new Bundle();
                bundle8.putAll(bundleArr4[0]);
                return vq2.A(context, AuthSdkSlothActivity.class, bundle8);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                m mVar3 = (m) obj;
                context.getClass();
                mVar3.getClass();
                Bundle[] bundleArr5 = {mVar3.t()};
                Bundle bundle9 = new Bundle();
                bundle9.putAll(bundleArr5[0]);
                return vq2.A(context, AuthSdkSlothComposeActivity.class, bundle9);
            default:
                i iVar = (i) obj;
                context.getClass();
                iVar.getClass();
                Intent intent10 = new Intent(context, (Class<?>) BiometricVerificationActivity.class);
                String e = eta.e();
                String str4 = iVar.b;
                z1 D = com.yandex.passport.internal.ui.a.D(iVar.a);
                y1 y1Var2 = iVar.c;
                y1Var2.getClass();
                intent10.putExtras(cxb.K(new Pair("biometric_verification_props", new f(com.yandex.plus.pay.ui.core.b.L(D), e, str4, com.yandex.plus.pay.ui.core.b.G(y1Var2)))));
                return intent10;
        }
    }

    @Override // defpackage.uh
    public th getSynchronousResult(Context context, Object obj) {
        switch (this.a) {
            case 0:
                context.getClass();
                ((String) obj).getClass();
                return null;
            case 1:
                context.getClass();
                ((esk) obj).getClass();
                return null;
            case 2:
                String[] strArr = (String[]) obj;
                context.getClass();
                strArr.getClass();
                if (strArr.length == 0) {
                    e5b e5bVar = e5b.a;
                    e5bVar.getClass();
                    return new th(e5bVar);
                }
                for (String str : strArr) {
                    if (etn.z(context, str) != 0) {
                        return null;
                    }
                }
                int a = tah.a(strArr.length);
                if (a < 16) {
                    a = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(a);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new th(linkedHashMap);
            case 3:
                String str3 = (String) obj;
                context.getClass();
                str3.getClass();
                if (etn.z(context, str3) == 0) {
                    return new th(Boolean.TRUE);
                }
                return null;
            default:
                return super.getSynchronousResult(context, obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10, types: [com.yandex.passport.internal.sloth.credentialmanager.a] */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // defpackage.uh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object parseResult(int i, Intent intent) {
        Object arrayList;
        List arrayList2;
        Object j;
        com.yandex.passport.internal.sloth.credentialmanager.b bVar;
        Bundle extras;
        String stringExtra;
        Object a0Var;
        Bundle extras2;
        r5 = false;
        boolean z = false;
        r7 = null;
        Exception exc = null;
        switch (this.a) {
            case 0:
                if (i != -1) {
                    intent = null;
                }
                if (intent != null) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Uri data = intent.getData();
                    if (data != null) {
                        linkedHashSet.add(data);
                    }
                    ClipData clipData = intent.getClipData();
                    if (clipData == null && linkedHashSet.isEmpty()) {
                        arrayList = c5b.a;
                    } else {
                        if (clipData != null) {
                            int itemCount = clipData.getItemCount();
                            for (int i2 = 0; i2 < itemCount; i2++) {
                                Uri uri = clipData.getItemAt(i2).getUri();
                                if (uri != null) {
                                    linkedHashSet.add(uri);
                                }
                            }
                        }
                        arrayList = new ArrayList(linkedHashSet);
                    }
                    if (arrayList != null) {
                        return arrayList;
                    }
                }
                return c5b.a;
            case 1:
                if (i != -1) {
                    intent = null;
                }
                if (intent == null) {
                    return null;
                }
                Uri data2 = intent.getData();
                if (data2 != null) {
                    return data2;
                }
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                Uri data3 = intent.getData();
                if (data3 != null) {
                    linkedHashSet2.add(data3);
                }
                ClipData clipData2 = intent.getClipData();
                if (clipData2 == null && linkedHashSet2.isEmpty()) {
                    arrayList2 = c5b.a;
                } else {
                    if (clipData2 != null) {
                        int itemCount2 = clipData2.getItemCount();
                        for (int i3 = 0; i3 < itemCount2; i3++) {
                            Uri uri2 = clipData2.getItemAt(i3).getUri();
                            if (uri2 != null) {
                                linkedHashSet2.add(uri2);
                            }
                        }
                    }
                    arrayList2 = new ArrayList(linkedHashSet2);
                }
                return (Uri) CollectionsKt.firstOrNull(arrayList2);
            case 2:
                if (i != -1) {
                    e5b e5bVar = e5b.a;
                    e5bVar.getClass();
                    return e5bVar;
                }
                if (intent == null) {
                    e5b e5bVar2 = e5b.a;
                    e5bVar2.getClass();
                    return e5bVar2;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    e5b e5bVar3 = e5b.a;
                    e5bVar3.getClass();
                    return e5bVar3;
                }
                ArrayList arrayList3 = new ArrayList(intArrayExtra.length);
                for (int i4 : intArrayExtra) {
                    arrayList3.add(Boolean.valueOf(i4 == 0));
                }
                return uah.n(CollectionsKt.C0(xz0.w(stringArrayExtra), arrayList3));
            case 3:
                if (intent == null || i != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra2 != null) {
                    int length = intArrayExtra2.length;
                    int i5 = 0;
                    while (true) {
                        if (i5 < length) {
                            if (intArrayExtra2[i5] == 0) {
                                z = true;
                            } else {
                                i5++;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 4:
                return new qh(i, intent);
            case 5:
                return new qh(i, intent);
            case 6:
                return new pdk(i, intent);
            case 7:
                return new qh(i, intent);
            case 8:
                return new pdk(i, intent);
            case 9:
                if (intent != null && i == -1) {
                    return (cvl) intent.getParcelableExtra("extra.removable.playlist.header");
                }
                return null;
            case 10:
                return new n6r(i, intent);
            case 11:
                if (intent == null) {
                    r7o r7oVar = z7o.b;
                    j = new t7o(new com.yandex.passport.api.exception.d("Accounts for auto login with provided filter not found"));
                } else if (i == -1) {
                    r7o r7oVar2 = z7o.b;
                    j = com.yandex.plus.core.locale.b.j(intent.getExtras());
                } else if (i != 13) {
                    r7o r7oVar3 = z7o.b;
                    j = new t7o(new com.yandex.passport.api.exception.d("Accounts for auto login with provided filter not found"));
                } else {
                    Bundle extras3 = intent.getExtras();
                    if (extras3 != null) {
                        Serializable serializable = extras3.getSerializable(Constants.KEY_EXCEPTION);
                        Exception exc2 = (Exception) (serializable instanceof Exception ? serializable : null);
                        if (exc2 != null) {
                            r7o r7oVar4 = z7o.b;
                            j = new t7o(exc2);
                        }
                    }
                    r7o r7oVar5 = z7o.b;
                    j = new t7o(new com.yandex.passport.api.exception.d("Accounts for auto login with provided filter not found"));
                }
                return new z7o(j);
            case 12:
                return q.c(i, intent);
            case 13:
                return l0.a(i, intent);
            case 14:
                return q.c(i, intent);
            case 15:
                if (i != -1) {
                    return null;
                }
                if (intent != null && (extras = intent.getExtras()) != null) {
                    String string = extras.getString("username_key");
                    String string2 = extras.getString("password_key");
                    String string3 = extras.getString("response_key");
                    boolean z2 = extras.getBoolean("is_from_dialog_key");
                    if (string3 != null) {
                        bVar = new com.yandex.passport.internal.sloth.credentialmanager.b(string3, z2);
                    } else if (string != null && string2 != null) {
                        bVar = new com.yandex.passport.internal.sloth.credentialmanager.a(string, string2, z2);
                    }
                    if (bVar instanceof com.yandex.passport.internal.sloth.credentialmanager.a) {
                        return null;
                    }
                    return (com.yandex.passport.internal.sloth.credentialmanager.a) bVar;
                }
                bVar = null;
                if (bVar instanceof com.yandex.passport.internal.sloth.credentialmanager.a) {
                }
                break;
            case 16:
                return q.c(i, intent);
            case 17:
                return new qh(i, intent);
            case 18:
                return q.d(i, intent);
            case 19:
                return Integer.valueOf(i);
            case 20:
                return q.d(i, intent);
            case 21:
                return q.d(i, intent);
            case 22:
                return Integer.valueOf(i);
            case 23:
                return Integer.valueOf(i);
            case 24:
                return Unit.a;
            case 25:
                return new ph(i != -1 ? i != 0 ? new c8o(i, 6) : c8o.g : c8o.h, intent);
            case 26:
                return new ph(i != -1 ? i != 0 ? new c8o(i, 6) : c8o.g : c8o.h, intent);
            case 27:
                return c.c(i, intent);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return c.c(i, intent);
            default:
                if (i != -1) {
                    if (i == 0) {
                        return com.yandex.passport.api.y.a;
                    }
                    if (i != 13) {
                        return i != 401 ? i != 601 ? new z(new t("Unexpected error")) : new z(new k("Connection error to :passport-biometric module")) : new z(new com.yandex.passport.api.exception.a());
                    }
                    if (intent != null && (extras2 = intent.getExtras()) != null) {
                        Serializable serializable2 = extras2.getSerializable(Constants.KEY_EXCEPTION);
                        exc = (Exception) (serializable2 instanceof Exception ? serializable2 : null);
                    }
                    a0Var = new z(exc != null ? new t(exc) : new t("Unknown error"));
                } else {
                    if (intent == null || (stringExtra = intent.getStringExtra("track_id")) == null) {
                        return new z(new t("No track_id value in intent"));
                    }
                    a0Var = new a0(stringExtra);
                }
                return a0Var;
        }
    }
}
