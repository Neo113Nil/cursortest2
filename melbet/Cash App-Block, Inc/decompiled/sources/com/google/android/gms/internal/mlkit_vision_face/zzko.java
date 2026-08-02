package com.google.android.gms.internal.mlkit_vision_face;

import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.datadog.android.rum.model.ViewEvent;
import com.datadog.android.rum.model.ViewEvent$State$EnumUnboxingLocalUtility;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.gson.JsonObject;
import com.squareup.cash.bankingbenefits.api.v1_0.core.PaycheckDepositStatusActiveBenefitType;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
public abstract class zzko {
    public static ViewEvent.Container fromJsonObject(JsonObject jsonObject) {
        try {
            JsonObject asJsonObject = jsonObject.get("view").getAsJsonObject();
            asJsonObject.getClass();
            ViewEvent.ContainerView fromJsonObject = zzkp.fromJsonObject(asJsonObject);
            String asString = jsonObject.get("source").getAsString();
            asString.getClass();
            for (int i : CameraSelector$$ExternalSyntheticOutline0.values(8)) {
                if (ViewEvent$State$EnumUnboxingLocalUtility.getJsonValue$4(i).equals(asString)) {
                    return new ViewEvent.Container(fromJsonObject, i);
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        } catch (IllegalStateException e) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Container", e);
            return null;
        } catch (NullPointerException e2) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Container", e2);
            return null;
        } catch (NumberFormatException e3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m("Unable to parse json into type Container", e3);
            return null;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static PaycheckDepositStatusActiveBenefitType toPdsaBenefitType(String str) {
        switch (str.hashCode()) {
            case -1915473535:
                if (str.equals("HIGH_INTEREST_SAVINGS")) {
                    return PaycheckDepositStatusActiveBenefitType.HIGH_INTEREST_SAVINGS;
                }
                break;
            case -197372317:
                if (str.equals("PRIORITY_PHONE_SUPPORT")) {
                    return PaycheckDepositStatusActiveBenefitType.PRIORITY_PHONE_SUPPORT;
                }
                break;
            case -162373373:
                if (str.equals("COVERED_PAPER_MONEY_DEPOSIT")) {
                    return PaycheckDepositStatusActiveBenefitType.COVERED_PAPER_MONEY_DEPOSIT;
                }
                break;
            case 301946407:
                if (str.equals("REIMBURSED_ATM_FEES")) {
                    return PaycheckDepositStatusActiveBenefitType.REIMBURSED_ATM_FEES;
                }
                break;
            case 748064289:
                if (str.equals("GUARANTEED_ACCESS_TO_BORROW")) {
                    return PaycheckDepositStatusActiveBenefitType.GUARANTEED_ACCESS_TO_BORROW;
                }
                break;
            case 869880173:
                if (str.equals("FREE_OVERDRAFT_COVERAGE")) {
                    return PaycheckDepositStatusActiveBenefitType.FREE_OVERDRAFT_COVERAGE;
                }
                break;
            case 1611699118:
                if (str.equals("INCREASED_BORROW_LIMIT")) {
                    return PaycheckDepositStatusActiveBenefitType.INCREASED_BORROW_LIMIT;
                }
                break;
        }
        return PaycheckDepositStatusActiveBenefitType.UNSPECIFIED;
    }
}
