package defpackage;

import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.common.entities.ApplicationTypeEntity;
import com.ybsdk.common.entities.SessionApplicationEntity;
import com.ybsdk.common.entities.SessionEntity$Action;
import com.ybsdk.common.entities.SessionEntity$ActionReason;
import com.ybsdk.network.dto.StartSessionApplicationResponse;
import com.ybsdk.network.dto.StartSessionResponse;
import com.ybsdk.network.dto.common.Product;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes3.dex */
public abstract class zzq0 {
    public static final Product a(YBProduct yBProduct) {
        switch (yzq0.d[yBProduct.ordinal()]) {
            case 1:
                return Product.PRO;
            case 2:
                return Product.WALLET;
            case 3:
                return Product.SPLIT;
            case 4:
                return Product.CREDIT_LIMIT;
            case 5:
                return Product.CREDIT_ACCOUNT;
            case 6:
                return Product.CREDIT;
            default:
                w511.b();
                return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.ArrayList] */
    public static final hzq0 b(StartSessionResponse startSessionResponse) {
        SessionEntity$Action sessionEntity$Action;
        ?? r7;
        SessionEntity$ActionReason sessionEntity$ActionReason;
        SessionEntity$ActionReason sessionEntity$ActionReason2;
        ApplicationTypeEntity applicationTypeEntity;
        String sessionUUID = startSessionResponse.getSessionUUID();
        String yandexUid = startSessionResponse.getYandexUid();
        YBProduct yBProduct = null;
        switch (yzq0.a[startSessionResponse.getAction().ordinal()]) {
            case 1:
                sessionEntity$Action = SessionEntity$Action.NONE;
                break;
            case 2:
                sessionEntity$Action = SessionEntity$Action.OPEN_PRODUCT;
                break;
            case 3:
                sessionEntity$Action = SessionEntity$Action.AUTHORIZATION;
                break;
            case 4:
                sessionEntity$Action = SessionEntity$Action.PASSPORT_REGISTRATION;
                break;
            case 5:
                sessionEntity$Action = SessionEntity$Action.BANK_REGISTRATION;
                break;
            case 6:
                sessionEntity$Action = SessionEntity$Action.APPLICATION_STATUS_CHECK;
                break;
            case 7:
                sessionEntity$Action = SessionEntity$Action.SUPPORT;
                break;
            case 8:
                sessionEntity$Action = SessionEntity$Action.AM_TOKEN_UPDATE;
                break;
            case 9:
                sessionEntity$Action = SessionEntity$Action.APP_UPDATE;
                break;
            case 10:
                sessionEntity$Action = SessionEntity$Action.PIN_TOKEN_CLEAR;
                break;
            case 11:
                sessionEntity$Action = SessionEntity$Action.PIN_TOKEN_REISSUE;
                break;
            case 12:
                sessionEntity$Action = SessionEntity$Action.PIN_TOKEN_RETRY;
                break;
            case 13:
                sessionEntity$Action = SessionEntity$Action.OPEN_DEEPLINK;
                break;
            default:
                w511.b();
                return null;
        }
        String startLandingUrl = startSessionResponse.getStartLandingUrl();
        String supportUrl = startSessionResponse.getSupportUrl();
        if (supportUrl == null) {
            supportUrl = "";
        }
        String str = supportUrl;
        List<StartSessionApplicationResponse> applications = startSessionResponse.getApplications();
        if (applications != null) {
            List<StartSessionApplicationResponse> list = applications;
            r7 = new ArrayList(tcc.n(list, 10));
            for (StartSessionApplicationResponse startSessionApplicationResponse : list) {
                String applicationId = startSessionApplicationResponse.getApplicationId();
                switch (yzq0.e[startSessionApplicationResponse.getType().ordinal()]) {
                    case 1:
                        applicationTypeEntity = ApplicationTypeEntity.UNKNOWN;
                        break;
                    case 2:
                        applicationTypeEntity = ApplicationTypeEntity.PRODUCT;
                        break;
                    case 3:
                        applicationTypeEntity = ApplicationTypeEntity.REGISTRATION;
                        break;
                    case 4:
                        applicationTypeEntity = ApplicationTypeEntity.DIGITAL_CARD_ISSUE;
                        break;
                    case 5:
                        applicationTypeEntity = ApplicationTypeEntity.SIMPLIFIED_IDENTIFICATION;
                        break;
                    case 6:
                        applicationTypeEntity = ApplicationTypeEntity.CHANGE_PHONE;
                        break;
                    default:
                        w511.b();
                        return null;
                }
                r7.add(new SessionApplicationEntity(applicationId, applicationTypeEntity, startSessionApplicationResponse.getRequired()));
            }
        } else {
            r7 = 0;
        }
        if (r7 == 0) {
            r7 = EmptyList.a;
        }
        String authorizationTrackId = startSessionResponse.getAuthorizationTrackId();
        Integer pinAttemptsLeft = startSessionResponse.getPinAttemptsLeft();
        StartSessionResponse.ActionReason actionReason = startSessionResponse.getActionReason();
        if (actionReason != null) {
            int i = yzq0.b[actionReason.ordinal()];
            if (i == 1) {
                sessionEntity$ActionReason2 = SessionEntity$ActionReason.PIN_TOKEN_REISSUE_TOO_MANY_FAILED_ATTEMPTS;
            } else {
                if (i != 2) {
                    w511.b();
                    return null;
                }
                sessionEntity$ActionReason2 = SessionEntity$ActionReason.PIN_TOKEN_REISSUE_REGISTRATION;
            }
            sessionEntity$ActionReason = sessionEntity$ActionReason2;
        } else {
            sessionEntity$ActionReason = null;
        }
        Product productToOpen = startSessionResponse.getProductToOpen();
        if (productToOpen != null) {
            switch (yzq0.c[productToOpen.ordinal()]) {
                case 1:
                    yBProduct = YBProduct.PRO;
                    break;
                case 2:
                    yBProduct = YBProduct.WALLET;
                    break;
                case 3:
                    yBProduct = YBProduct.SPLIT;
                    break;
                case 4:
                    yBProduct = YBProduct.CREDIT_LIMIT;
                    break;
                case 5:
                    yBProduct = YBProduct.CREDIT_ACCOUNT;
                    break;
                case 6:
                    yBProduct = YBProduct.CREDIT;
                    break;
                case 7:
                    x4c.g("Start session returned unknown product_to_open type", null, null, null, 14);
                    break;
                default:
                    w511.b();
                    return null;
            }
        }
        return new hzq0(sessionUUID, yandexUid, sessionEntity$Action, startSessionResponse.getDeeplink(), str, startLandingUrl, r7, authorizationTrackId, pinAttemptsLeft, sessionEntity$ActionReason, yBProduct);
    }
}
