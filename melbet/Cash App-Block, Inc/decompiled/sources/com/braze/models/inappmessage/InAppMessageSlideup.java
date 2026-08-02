package com.braze.models.inappmessage;

import android.graphics.Color;
import bo.app.a9;
import bo.app.ma;
import com.braze.enums.inappmessage.CropType;
import com.braze.enums.inappmessage.MessageType;
import com.braze.enums.inappmessage.SlideFrom;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.support.BrazeLogger;
import com.braze.support.BrazeLogger$$ExternalSyntheticLambda3;
import com.braze.support.JsonUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0006\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageSlideup;", "Lcom/braze/models/inappmessage/InAppMessageWithImageBase;", "Lorg/json/JSONObject;", "jsonObject", "Lbo/app/a9;", "brazeManager", "<init>", "(Lorg/json/JSONObject;Lbo/app/a9;)V", "Lcom/braze/enums/inappmessage/SlideFrom;", "slideFrom", "", "chevronColor", "(Lorg/json/JSONObject;Lbo/app/a9;Lcom/braze/enums/inappmessage/SlideFrom;I)V", "", "enableDarkTheme", "()V", "forJsonPut", "()Lorg/json/JSONObject;", "Lcom/braze/enums/inappmessage/SlideFrom;", "getSlideFrom", "()Lcom/braze/enums/inappmessage/SlideFrom;", "setSlideFrom", "(Lcom/braze/enums/inappmessage/SlideFrom;)V", "I", "getChevronColor", "()I", "setChevronColor", "(I)V", "Lcom/braze/enums/inappmessage/MessageType;", "getMessageType", "()Lcom/braze/enums/inappmessage/MessageType;", "messageType", "Companion", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InAppMessageSlideup extends InAppMessageWithImageBase {
    private int chevronColor;
    private SlideFrom slideFrom;

    private InAppMessageSlideup(JSONObject jSONObject, a9 a9Var, SlideFrom slideFrom, int i) {
        super(jSONObject, a9Var);
        this.slideFrom = SlideFrom.BOTTOM;
        this.chevronColor = Color.parseColor("#9B9B9B");
        if (slideFrom != null) {
            this.slideFrom = slideFrom;
        }
        this.chevronColor = i;
        setCropType((CropType) JsonUtils.optEnum(jSONObject, "crop_type", CropType.class, CropType.FIT_CENTER));
        setMessageTextAlign((TextAlign) JsonUtils.optEnum(jSONObject, "text_align_message", TextAlign.class, TextAlign.START));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String enableDarkTheme$lambda$0() {
        return "Cannot apply dark theme with a null themes wrapper";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String forJsonPut$lambda$1() {
        return "Error creating JSON.";
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessageThemeable
    public void enableDarkTheme() {
        Integer num;
        super.enableDarkTheme();
        ma inAppMessageDarkThemeWrapper = getInAppMessageDarkThemeWrapper();
        if (inAppMessageDarkThemeWrapper == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.D, (Throwable) null, false, (Function0) new BrazeLogger$$ExternalSyntheticLambda3(10), 6, (Object) null);
            return;
        }
        Integer num2 = inAppMessageDarkThemeWrapper.c;
        if ((num2 != null && num2.intValue() == -1) || (num = inAppMessageDarkThemeWrapper.c) == null) {
            return;
        }
        this.chevronColor = num.intValue();
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut, reason: avoid collision after fix types in other method */
    public JSONObject getPropertiesJSONObject() {
        JSONObject jsonObject = getJsonObject();
        if (jsonObject != null) {
            return jsonObject;
        }
        JSONObject propertiesJSONObject = super.getPropertiesJSONObject();
        try {
            propertiesJSONObject.put("slide_from", this.slideFrom.toString());
            propertiesJSONObject.put("close_btn_color", this.chevronColor);
            propertiesJSONObject.put("type", getMessageType().name());
            return propertiesJSONObject;
        } catch (JSONException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new BrazeLogger$$ExternalSyntheticLambda3(11), 4, (Object) null);
            return propertiesJSONObject;
        }
    }

    public final int getChevronColor() {
        return this.chevronColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessage
    public MessageType getMessageType() {
        return MessageType.SLIDEUP;
    }

    public final SlideFrom getSlideFrom() {
        return this.slideFrom;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InAppMessageSlideup(JSONObject jSONObject, a9 a9Var) {
        this(jSONObject, a9Var, (SlideFrom) JsonUtils.optEnum(jSONObject, "slide_from", SlideFrom.class, SlideFrom.BOTTOM), jSONObject.optInt("close_btn_color"));
        jSONObject.getClass();
        a9Var.getClass();
    }
}
