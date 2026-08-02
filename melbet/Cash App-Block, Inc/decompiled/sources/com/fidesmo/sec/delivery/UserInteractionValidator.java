package com.fidesmo.sec.delivery;

import android.util.Log;
import com.fidesmo.sec.delivery.models.DataRequirement;
import com.fidesmo.sec.delivery.models.FpAppStepupReturn;
import com.fidesmo.sec.delivery.models.FpWebStepupReturn;
import com.fidesmo.sec.delivery.models.PaymentCard;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatcherMatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u001c\u0010\u0012\u001a\u0018\u0012\b\u0012\u00060\u0004j\u0002`\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0013j\u0002`\u0015J\u000e\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0004J\u000e\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0004J\u000e\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0004J\u0016\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0004J2\u0010\u001c\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u001c\u0010\u0012\u001a\u0018\u0012\b\u0012\u00060\u0004j\u0002`\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0013j\u0002`\u0015J\u000e\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0004J\u000e\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0004J\u000e\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0004J(\u0010 \u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0013J\u000e\u0010!\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0004J\u000e\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0004J\u000e\u0010#\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0004J\u000e\u0010$\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Lcom/fidesmo/sec/delivery/UserInteractionValidator;", "", "()V", "allowedNumberChars", "", "emailFormatPattern", "Ljava/util/regex/Pattern;", "gson", "Lcom/google/gson/Gson;", "numericInputMaxLength", "", "tag", "textInputMaxLength", "noExtraResponses", "", "requirements", "", "Lcom/fidesmo/sec/delivery/models/DataRequirement;", "responses", "", "Lcom/fidesmo/sec/delivery/models/DataRequirementId;", "Lcom/fidesmo/sec/delivery/models/UserDataResponse;", "plainCardDetected", "response", "validateButtonResponse", "validateCheckbox", "validateDataRequirementResponse", "requirement", "validateDataRequirementResponses", "validateEditText", "validateEmail", "validateEmptyResponse", "validateExternalEncryptedResponse", "validateFpAppStepup", "validateFpWebStepup", "validateNumber", "validatePaymentCard", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UserInteractionValidator {
    private static final String allowedNumberChars = "0123456789";
    private static final Pattern emailFormatPattern;
    public static final int numericInputMaxLength = 8;
    private static final String tag = "UI validator";
    public static final int textInputMaxLength = 280;
    public static final UserInteractionValidator INSTANCE = new UserInteractionValidator();
    private static final Gson gson = new Gson();

    static {
        Pattern compile = Pattern.compile("[a-zA-Z0-9+._%\\-]{1,256}@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+");
        compile.getClass();
        emailFormatPattern = compile;
    }

    private UserInteractionValidator() {
    }

    public final boolean noExtraResponses(List<? extends DataRequirement> requirements, Map<String, String> responses) {
        Object obj;
        requirements.getClass();
        responses.getClass();
        while (true) {
            boolean z = true;
            for (String str : responses.keySet()) {
                if (z) {
                    Iterator<T> it = requirements.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (Intrinsics.areEqual(((DataRequirement) obj).getId(), str)) {
                            break;
                        }
                    }
                    if (obj != null) {
                        break;
                    }
                }
                z = false;
            }
            return z;
        }
    }

    public final boolean plainCardDetected(String response) {
        response.getClass();
        try {
            PaymentCard paymentCard = (PaymentCard) new Gson().fromJson(response, PaymentCard.class);
            StringBuilder sb = new StringBuilder("The response can be decoded as a PaymentCard: ");
            sb.append(paymentCard != null);
            Log.d("ExternalEncryption", sb.toString());
            return paymentCard != null;
        } catch (JsonSyntaxException unused) {
            Log.d("ExternalEncryption", "Error found decoding server message");
            MatcherMatchResult find = new Regex("\\d{13,19}").find(response);
            String valueOf = String.valueOf(find != null ? find.getValue() : null);
            return new PaymentCard(valueOf, 0, 0, "").isValidLuhn(valueOf);
        }
    }

    public final boolean validateButtonResponse(String response) {
        boolean z;
        response.getClass();
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i >= response.length()) {
                z = true;
                break;
            }
            if (!StringsKt.contains((CharSequence) allowedNumberChars, response.charAt(i), false)) {
                z = false;
                break;
            }
            i++;
        }
        boolean z3 = response.length() <= 2;
        if (z && z3) {
            z2 = true;
        }
        if (!z2) {
            Log.d(tag, "Response to button requirement is not valid.");
        }
        return z2;
    }

    public final boolean validateCheckbox(String response) {
        response.getClass();
        boolean z = Intrinsics.areEqual(response, "true") || Intrinsics.areEqual(response, "false");
        if (!z) {
            Log.d(tag, "Response to Checkbox data requirement is not valid.");
        }
        return z;
    }

    public final boolean validateDataRequirementResponse(DataRequirement requirement, String response) {
        requirement.getClass();
        response.getClass();
        boolean z = requirement instanceof DataRequirement.EditText;
        if (!z ? !(requirement instanceof DataRequirement.EditEmail) ? !(!(requirement instanceof DataRequirement.EditObfuscatedNumber) ? (requirement instanceof DataRequirement.EditNumber) && ((DataRequirement.EditNumber) requirement).getMandatory() && response.length() <= 0 : !(!((DataRequirement.EditObfuscatedNumber) requirement).getMandatory() || response.length() > 0)) : !(!((DataRequirement.EditEmail) requirement).getMandatory() || response.length() > 0) : !((DataRequirement.EditText) requirement).getMandatory() || response.length() > 0) {
            Log.d(tag, "Validation failed because a mandatory field has an empty response.");
            return false;
        }
        if (requirement instanceof DataRequirement.Checkbox) {
            return validateCheckbox(response);
        }
        if (requirement instanceof DataRequirement.EditEmail) {
            return validateEmail(response);
        }
        if (requirement instanceof DataRequirement.EditNumber ? true : requirement instanceof DataRequirement.EditObfuscatedNumber) {
            return validateNumber(response);
        }
        if (z) {
            return validateEditText(response);
        }
        if (requirement instanceof DataRequirement.FpAppStepupAndroid ? true : requirement instanceof DataRequirement.FpAppUrlStepupAndroid ? true : requirement instanceof DataRequirement.OpenUrl) {
            return validateEmptyResponse(response) || validateFpAppStepup(response);
        }
        if (requirement instanceof DataRequirement.FpWebActivation) {
            return validateEmptyResponse(response) || validateFpWebStepup(response);
        }
        if (requirement instanceof DataRequirement.Image ? true : requirement instanceof DataRequirement.Text) {
            return validateEmptyResponse(response);
        }
        if (requirement instanceof DataRequirement.OptionsAsButton) {
            return validateButtonResponse(response);
        }
        if (requirement instanceof DataRequirement.PaymentCard) {
            return validatePaymentCard(response);
        }
        if (requirement instanceof DataRequirement.Unknown) {
            return true;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return false;
    }

    public final boolean validateDataRequirementResponses(List<? extends DataRequirement> requirements, Map<String, String> responses) {
        requirements.getClass();
        responses.getClass();
        while (true) {
            boolean z = true;
            for (DataRequirement dataRequirement : requirements) {
                boolean z2 = false;
                try {
                    String str = (String) MapsKt__MapsKt.getValue(responses, dataRequirement.getId());
                    if (z && str != null && INSTANCE.validateDataRequirementResponse(dataRequirement, str)) {
                        z2 = true;
                    }
                } catch (NoSuchElementException unused) {
                    if (dataRequirement instanceof DataRequirement.EditText) {
                        if (!((DataRequirement.EditText) dataRequirement).getMandatory() && z) {
                        }
                    } else if (dataRequirement instanceof DataRequirement.EditEmail) {
                        if (!((DataRequirement.EditEmail) dataRequirement).getMandatory() && z) {
                        }
                    } else if (dataRequirement instanceof DataRequirement.EditObfuscatedNumber) {
                        if (!((DataRequirement.EditObfuscatedNumber) dataRequirement).getMandatory() && z) {
                        }
                    } else if (!(dataRequirement instanceof DataRequirement.EditNumber)) {
                        continue;
                    } else if (!((DataRequirement.EditNumber) dataRequirement).getMandatory() && z) {
                    }
                }
                z = z2;
            }
            return z;
        }
    }

    public final boolean validateEditText(String response) {
        response.getClass();
        boolean z = response.length() <= 280;
        if (!z) {
            Log.d(tag, "Response to edit text requirement is not valid because it is too long.");
        }
        return z;
    }

    public final boolean validateEmail(String response) {
        response.getClass();
        boolean matches = emailFormatPattern.matcher(response).matches();
        boolean z = false;
        boolean z2 = response.length() <= 280;
        if (matches && z2) {
            z = true;
        }
        if (!z) {
            Log.d(tag, "Response to Email data requirement is not valid.");
        }
        return z;
    }

    public final boolean validateEmptyResponse(String response) {
        response.getClass();
        boolean z = response.length() == 0;
        if (!z) {
            Log.d(tag, "Response to user interaction field is not empty.");
        }
        return z;
    }

    public final boolean validateExternalEncryptedResponse(List<? extends DataRequirement> requirements, Map<String, String> responses) {
        requirements.getClass();
        responses.getClass();
        List<? extends DataRequirement> list = requirements;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (DataRequirement dataRequirement : list) {
                if (dataRequirement instanceof DataRequirement.PaymentCard) {
                    String str = responses.get(dataRequirement.getId());
                    if (str != null) {
                        return !INSTANCE.plainCardDetected(str);
                    }
                    Log.d("ExternalEncryption", "PaymentCard response is nil");
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean validateFpAppStepup(String response) {
        response.getClass();
        try {
            Gson gson2 = gson;
            FpAppStepupReturn fpAppStepupReturn = (FpAppStepupReturn) gson2.fromJson(response, FpAppStepupReturn.class);
            r1 = fpAppStepupReturn != null;
            if (Intrinsics.areEqual((JsonObject) gson2.fromJson(response, JsonObject.class), (JsonObject) gson2.fromJson(new GsonBuilder().create().toJson(fpAppStepupReturn), JsonObject.class))) {
                return r1;
            }
            Log.w(tag, "There is an unexpected field in the response to FP app step up data requirement.");
            return r1;
        } catch (Exception e) {
            Log.d(tag, "Exception encountered validating FP app step up data requirement response: " + e);
            return r1;
        }
    }

    public final boolean validateFpWebStepup(String response) {
        response.getClass();
        try {
            Gson gson2 = gson;
            FpWebStepupReturn fpWebStepupReturn = (FpWebStepupReturn) gson2.fromJson(response, FpWebStepupReturn.class);
            r1 = fpWebStepupReturn != null;
            if (Intrinsics.areEqual((JsonObject) gson2.fromJson(response, JsonObject.class), (JsonObject) gson2.fromJson(new GsonBuilder().create().toJson(fpWebStepupReturn), JsonObject.class))) {
                return r1;
            }
            Log.w(tag, "There is an unexpected field in the response to FP app step up data requirement.");
            return r1;
        } catch (Exception e) {
            Log.d(tag, "Exception encountered validating FP app step up data requirement response: " + e);
            return r1;
        }
    }

    public final boolean validateNumber(String response) {
        boolean z;
        response.getClass();
        boolean z2 = response.length() <= 8;
        int i = 0;
        while (true) {
            if (i >= response.length()) {
                z = true;
                break;
            }
            if (!StringsKt.contains((CharSequence) allowedNumberChars, response.charAt(i), false)) {
                z = false;
                break;
            }
            i++;
        }
        boolean z3 = z2 && z;
        if (!z3) {
            Log.d(tag, "Response to Number data requirement is not valid.");
        }
        return z3;
    }

    public final boolean validatePaymentCard(String response) {
        response.getClass();
        try {
            PaymentCard paymentCard = (PaymentCard) new Gson().fromJson(response, PaymentCard.class);
            if (paymentCard == null) {
                return false;
            }
            return paymentCard.isValid();
        } catch (JsonSyntaxException unused) {
            return false;
        }
    }
}
