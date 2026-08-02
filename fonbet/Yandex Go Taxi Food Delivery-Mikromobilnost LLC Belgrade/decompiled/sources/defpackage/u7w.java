package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.yandex.fintechsdk.entities.environment.PayEnvironment;
import com.yandex.fintechsdk.entities.region.Region;
import com.yandex.fintechsdk.flows.applink.payment.internal.activity.args.ApplinkPaymentParseResult$RedirectHost;
import com.yandex.fintechsdk.flows.applink.payment.internal.activity.args.FailureReason;
import com.yandex.fintechsdk.flows.applink.payment.internal.activity.args.IntentArgs;
import com.yandex.fintechsdk.flows.applink.payment.internal.model.feature.FeatureFlag;
import com.yandex.fintechsdk.flows.applink.payment.internal.model.payment.PayboxScenario;
import com.yandex.pay.InternalSessionDependencies;
import com.yandex.pay.Metadata;
import com.yandex.pay.PaymentData;
import com.yandex.pay.PaymentSessionKey;
import com.yandex.pay.base.api.MerchantData;
import com.yandex.pay.base.api.MerchantId;
import com.yandex.pay.base.api.MerchantName;
import com.yandex.pay.data.config.BoltConfig;
import com.yandex.pay.payment.PaymentData;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.EmptySet;
import kotlin.collections.a;
import kotlin.collections.builders.SetBuilder;

/* loaded from: classes12.dex */
public final class u7w {
    public final jli0 a = new jli0();
    public final k7g0 b = new k7g0();
    public final eg21 c = new eg21();

    /* JADX WARN: Removed duplicated region for block: B:29:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final o23 a(Intent intent) {
        String path;
        ApplinkPaymentParseResult$RedirectHost applinkPaymentParseResult$RedirectHost;
        IntentArgs intentArgs;
        IntentArgs intentArgs2;
        PaymentData paymentData;
        Set set;
        List<String> W;
        String queryParameter;
        Uri data;
        String queryParameter2;
        Uri parse;
        Uri data2;
        String queryParameter3;
        FeatureFlag featureFlag;
        String queryParameter4;
        Uri parse2;
        PayboxScenario payboxScenario;
        String str;
        FeatureFlag featureFlag2;
        PayboxScenario payboxScenario2;
        this.a.getClass();
        Uri data3 = intent.getData();
        Enum r4 = null;
        if (data3 == null || (path = data3.getPath()) == null || !cvu0.x(path, ApplinkPaymentParseResult$RedirectHost.PATH_PREFIX, false)) {
            applinkPaymentParseResult$RedirectHost = null;
        } else {
            String host = data3.getHost();
            new d5o();
            PayEnvironment a = d5o.a(host);
            new tpi0();
            applinkPaymentParseResult$RedirectHost = new ApplinkPaymentParseResult$RedirectHost(data3.toString(), a, tpi0.a(host));
        }
        if (applinkPaymentParseResult$RedirectHost != null) {
            return applinkPaymentParseResult$RedirectHost;
        }
        this.b.getClass();
        String stringExtra = intent.getStringExtra("url");
        if (stringExtra == null) {
            stringExtra = intent.getDataString();
        }
        if (stringExtra != null && (parse2 = Uri.parse(stringExtra)) != null) {
            String str2 = (String) a.R(parse2.getPathSegments());
            if (str2 != null) {
                int hashCode = str2.hashCode();
                if (hashCode != 108) {
                    if (hashCode != 111) {
                        if (hashCode != 117) {
                            if (hashCode == 3714 && str2.equals("tv")) {
                                payboxScenario2 = PayboxScenario.PAY_TV;
                                payboxScenario = payboxScenario2;
                            }
                        } else if (str2.equals("u")) {
                            payboxScenario2 = PayboxScenario.PAY_OFFLINE;
                            payboxScenario = payboxScenario2;
                        }
                    } else if (str2.equals("o")) {
                        if (jl40.l(a.R(parse2.getPathSegments()), "o")) {
                            String queryParameter5 = parse2.getQueryParameter("is_tv");
                            if (queryParameter5 != null ? jl40.l(evu0.j0(queryParameter5), Boolean.TRUE) : false) {
                                payboxScenario2 = PayboxScenario.PAY_TV;
                                payboxScenario = payboxScenario2;
                            }
                        }
                        payboxScenario2 = PayboxScenario.PAY_BOX_OFFLINE;
                        payboxScenario = payboxScenario2;
                    }
                } else if (str2.equals("l")) {
                    payboxScenario2 = PayboxScenario.PAY_BOX_OFFLINE;
                    payboxScenario = payboxScenario2;
                }
                if (payboxScenario != null) {
                    String host2 = parse2.getHost();
                    String queryParameter6 = parse2.getQueryParameter("merchant_id");
                    if (queryParameter6 == null) {
                        queryParameter6 = "";
                    }
                    MerchantId merchantId = new MerchantId(queryParameter6);
                    int i = j7g0.a[payboxScenario.ordinal()];
                    if (i == 1) {
                        str = "TV_MERCHANT";
                    } else {
                        if (i != 2 && i != 3 && i != 4) {
                            w511.b();
                            return null;
                        }
                        str = "OFFLINE";
                    }
                    String queryParameter7 = parse2.getQueryParameter("merchant_name");
                    if (queryParameter7 != null) {
                        str = queryParameter7;
                    }
                    MerchantData merchantData = new MerchantData(merchantId, new MerchantName(str), null);
                    String queryParameter8 = parse2.getQueryParameter("session_id");
                    if (queryParameter8 == null) {
                        queryParameter8 = UUID.randomUUID().toString();
                    }
                    PaymentSessionKey paymentSessionKey = new PaymentSessionKey(queryParameter8);
                    new d5o();
                    BoltConfig boltConfig = new BoltConfig(merchantData, d5o.a(host2));
                    SetBuilder setBuilder = new SetBuilder();
                    if (jl40.l(a.R(parse2.getPathSegments()), "l")) {
                        FeatureFlag.Companion.getClass();
                        featureFlag2 = FeatureFlag.WEB;
                        setBuilder.add(featureFlag2);
                    }
                    SetBuilder b = setBuilder.b();
                    boolean booleanExtra = intent.getBooleanExtra("BY_DEEPLINK", false);
                    PaymentData paymentData2 = new PaymentData(parse2.toString(), null, 2, null);
                    new tpi0();
                    intentArgs = new IntentArgs(null, boltConfig, b, booleanExtra, true, null, payboxScenario, paymentData2, paymentSessionKey, tpi0.a(host2), new InternalSessionDependencies(queryParameter8));
                    if (intentArgs == null) {
                        return new m23(intentArgs);
                    }
                    this.c.getClass();
                    Uri data4 = intent.getData();
                    Boolean j0 = (data4 == null || (queryParameter4 = data4.getQueryParameter("canBeAnonymous")) == null) ? null : evu0.j0(queryParameter4);
                    Uri data5 = intent.getData();
                    boolean parseBoolean = Boolean.parseBoolean(data5 != null ? data5.getQueryParameter("webOnly") : null);
                    Uri data6 = intent.getData();
                    if (data6 == null || (queryParameter = data6.getQueryParameter("merchantId")) == null || (data = intent.getData()) == null || (queryParameter2 = data.getQueryParameter("link")) == null || (parse = Uri.parse(queryParameter2)) == null || (data2 = intent.getData()) == null || (queryParameter3 = data2.getQueryParameter("sessionId")) == null) {
                        intentArgs2 = null;
                    } else {
                        MerchantData merchantData2 = new MerchantData(new MerchantId(queryParameter), new MerchantName(queryParameter), null);
                        PaymentSessionKey paymentSessionKey2 = new PaymentSessionKey(queryParameter3);
                        new d5o();
                        BoltConfig boltConfig2 = new BoltConfig(merchantData2, d5o.a(parse.getHost()));
                        SetBuilder setBuilder2 = new SetBuilder();
                        if (parseBoolean) {
                            FeatureFlag.Companion.getClass();
                            featureFlag = FeatureFlag.WEB;
                            setBuilder2.add(featureFlag);
                        }
                        SetBuilder b2 = setBuilder2.b();
                        PaymentData paymentData3 = new PaymentData(parse.toString(), null, 2, null);
                        PayboxScenario payboxScenario3 = PayboxScenario.PAY_ONLINE;
                        new tpi0();
                        intentArgs2 = new IntentArgs(j0, boltConfig2, b2, false, false, null, payboxScenario3, paymentData3, paymentSessionKey2, tpi0.a(parse.getHost()), new InternalSessionDependencies(queryParameter3));
                    }
                    if (intentArgs2 != null) {
                        return new m23(intentArgs2);
                    }
                    InternalSessionDependencies internalSessionDependencies = (InternalSessionDependencies) intent.getParcelableExtra("bolt_internal_dependencies_extra_key");
                    PaymentSessionKey paymentSessionKey3 = (PaymentSessionKey) intent.getParcelableExtra("session_key_extra_key");
                    if (paymentSessionKey3 == null) {
                        return new l23(FailureReason.MISSING_SESSION_KEY);
                    }
                    BoltConfig boltConfig3 = (BoltConfig) intent.getParcelableExtra("config_extra_key");
                    if (boltConfig3 == null) {
                        return new l23(FailureReason.MISSING_PAY_CONFIG);
                    }
                    Bundle extras = intent.getExtras();
                    com.yandex.pay.PaymentData paymentData4 = extras != null ? (com.yandex.pay.PaymentData) extras.getParcelable("payment_data_extra_key") : null;
                    if (paymentData4 == null) {
                        paymentData = null;
                    } else {
                        if (!(paymentData4 instanceof PaymentData.PaymentUrlFlowData)) {
                            w511.b();
                            return null;
                        }
                        PaymentData.PaymentUrlFlowData paymentUrlFlowData = (PaymentData.PaymentUrlFlowData) paymentData4;
                        String paymentUrl = paymentUrlFlowData.getPaymentUrl();
                        Metadata metadata = paymentUrlFlowData.getMetadata();
                        paymentData = new com.yandex.pay.payment.PaymentData(paymentUrl, metadata != null ? new com.yandex.pay.payment.Metadata(metadata.getValue()) : null);
                    }
                    if (paymentData == null) {
                        return new l23(FailureReason.MISSING_PAYMENT_DATA);
                    }
                    String stringExtra2 = intent.getStringExtra("required_feature_flags");
                    if (stringExtra2 != null) {
                        FeatureFlag.Companion.getClass();
                        W = evu0.W(stringExtra2, new String[]{","}, (r2 & 4) != 0 ? 0 : 2);
                        ArrayList arrayList = new ArrayList();
                        for (String str3 : W) {
                            FeatureFlag.Companion.getClass();
                            String obj = evu0.k0(str3).toString();
                            if (obj.length() <= 0) {
                                obj = null;
                            }
                            FeatureFlag featureFlag3 = obj != null ? new FeatureFlag(obj) : null;
                            if (featureFlag3 != null) {
                                arrayList.add(featureFlag3);
                            }
                        }
                        set = a.N0(arrayList);
                    } else {
                        set = EmptySet.a;
                    }
                    Set set2 = set;
                    String stringExtra3 = intent.getStringExtra("merchant_client_id_extra_key");
                    int intExtra = intent.getIntExtra(PayboxScenario.class.getName(), -1);
                    Integer valueOf = Integer.valueOf(intExtra);
                    if (intExtra == -1) {
                        valueOf = null;
                    }
                    if (valueOf != null) {
                        int intValue = valueOf.intValue();
                        Enum[] enumArr = (Enum[]) PayboxScenario.class.getEnumConstants();
                        if (enumArr != null) {
                            r4 = enumArr[intValue];
                        }
                    }
                    PayboxScenario payboxScenario4 = (PayboxScenario) r4;
                    if (payboxScenario4 == null) {
                        payboxScenario4 = PayboxScenario.PAY_ONLINE;
                    }
                    return new m23(new IntentArgs(null, boltConfig3, set2, false, false, stringExtra3, payboxScenario4, paymentData, paymentSessionKey3, Region.RU, internalSessionDependencies));
                }
            }
            payboxScenario = null;
            if (payboxScenario != null) {
            }
        }
        intentArgs = null;
        if (intentArgs == null) {
        }
    }
}
