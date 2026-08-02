package defpackage;

import com.ybsdk.api.entities.YBProduct;
import com.ybsdk.common.entities.ApplicationTypeEntity;
import com.ybsdk.common.entities.SessionApplicationEntity;
import com.ybsdk.common.entities.SessionEntity$Action;
import com.ybsdk.feature.pin.api.entities.PinApplicationTypeEntity;
import com.ybsdk.feature.pin.api.entities.ProductEntity;
import com.ybsdk.feature.pin.api.entities.StartSessionState;

/* loaded from: classes3.dex */
public abstract class xvb0 {
    public static final YBProduct a(ProductEntity productEntity) {
        switch (wvb0.c[productEntity.ordinal()]) {
            case 1:
                return YBProduct.PRO;
            case 2:
                return YBProduct.WALLET;
            case 3:
                return YBProduct.SPLIT;
            case 4:
                return YBProduct.CREDIT_LIMIT;
            case 5:
                return YBProduct.CREDIT_ACCOUNT;
            case 6:
                return YBProduct.CREDIT;
            default:
                w511.b();
                return null;
        }
    }

    public static final StartSessionState.Action b(SessionEntity$Action sessionEntity$Action) {
        switch (wvb0.f[sessionEntity$Action.ordinal()]) {
            case 1:
                return StartSessionState.Action.NONE;
            case 2:
                return StartSessionState.Action.AUTHORIZATION;
            case 3:
                return StartSessionState.Action.PASSPORT_REGISTRATION;
            case 4:
                return StartSessionState.Action.BANK_REGISTRATION;
            case 5:
                return StartSessionState.Action.APPLICATION_STATUS_CHECK;
            case 6:
                return StartSessionState.Action.SUPPORT;
            case 7:
                return StartSessionState.Action.AM_TOKEN_UPDATE;
            case 8:
                return StartSessionState.Action.APP_UPDATE;
            case 9:
                return StartSessionState.Action.PIN_TOKEN_CLEAR;
            case 10:
                return StartSessionState.Action.PIN_TOKEN_REISSUE;
            case 11:
                return StartSessionState.Action.PIN_TOKEN_RETRY;
            case 12:
                return StartSessionState.Action.OPEN_PRODUCT;
            case 13:
                return StartSessionState.Action.OPEN_DEEPLINK;
            default:
                w511.b();
                return null;
        }
    }

    public static final SessionEntity$Action c(StartSessionState.Action action) {
        switch (wvb0.e[action.ordinal()]) {
            case 1:
                return SessionEntity$Action.NONE;
            case 2:
                return SessionEntity$Action.AUTHORIZATION;
            case 3:
                return SessionEntity$Action.PASSPORT_REGISTRATION;
            case 4:
                return SessionEntity$Action.BANK_REGISTRATION;
            case 5:
                return SessionEntity$Action.APPLICATION_STATUS_CHECK;
            case 6:
                return SessionEntity$Action.SUPPORT;
            case 7:
                return SessionEntity$Action.AM_TOKEN_UPDATE;
            case 8:
                return SessionEntity$Action.APP_UPDATE;
            case 9:
                return SessionEntity$Action.PIN_TOKEN_CLEAR;
            case 10:
                return SessionEntity$Action.PIN_TOKEN_REISSUE;
            case 11:
                return SessionEntity$Action.PIN_TOKEN_RETRY;
            case 12:
                return SessionEntity$Action.OPEN_PRODUCT;
            case 13:
                return SessionEntity$Action.OPEN_DEEPLINK;
            default:
                w511.b();
                return null;
        }
    }

    public static final ProductEntity d(YBProduct yBProduct) {
        switch (wvb0.d[yBProduct.ordinal()]) {
            case 1:
                return ProductEntity.PRO;
            case 2:
                return ProductEntity.WALLET;
            case 3:
                return ProductEntity.SPLIT;
            case 4:
                return ProductEntity.CREDIT_LIMIT;
            case 5:
                return ProductEntity.CREDIT_ACCOUNT;
            case 6:
                return ProductEntity.CREDIT;
            default:
                w511.b();
                return null;
        }
    }

    public static final uzb0 e(SessionApplicationEntity sessionApplicationEntity) {
        PinApplicationTypeEntity pinApplicationTypeEntity;
        String applicationId = sessionApplicationEntity.getApplicationId();
        switch (wvb0.a[sessionApplicationEntity.getType().ordinal()]) {
            case 1:
                pinApplicationTypeEntity = PinApplicationTypeEntity.UNKNOWN;
                break;
            case 2:
                pinApplicationTypeEntity = PinApplicationTypeEntity.PRODUCT;
                break;
            case 3:
                pinApplicationTypeEntity = PinApplicationTypeEntity.REGISTRATION;
                break;
            case 4:
                pinApplicationTypeEntity = PinApplicationTypeEntity.SIMPLIFIED_IDENTIFICATION;
                break;
            case 5:
                pinApplicationTypeEntity = PinApplicationTypeEntity.DIGITAL_CARD_ISSUE;
                break;
            case 6:
                pinApplicationTypeEntity = PinApplicationTypeEntity.CHANGE_PHONE;
                break;
            default:
                w511.b();
                return null;
        }
        return new uzb0(applicationId, pinApplicationTypeEntity, sessionApplicationEntity.getRequired());
    }

    public static final SessionApplicationEntity f(uzb0 uzb0Var) {
        ApplicationTypeEntity applicationTypeEntity;
        String str = uzb0Var.a;
        switch (wvb0.b[uzb0Var.b.ordinal()]) {
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
                applicationTypeEntity = ApplicationTypeEntity.SIMPLIFIED_IDENTIFICATION;
                break;
            case 5:
                applicationTypeEntity = ApplicationTypeEntity.DIGITAL_CARD_ISSUE;
                break;
            case 6:
                applicationTypeEntity = ApplicationTypeEntity.CHANGE_PHONE;
                break;
            default:
                w511.b();
                return null;
        }
        return new SessionApplicationEntity(str, applicationTypeEntity, uzb0Var.c);
    }
}
