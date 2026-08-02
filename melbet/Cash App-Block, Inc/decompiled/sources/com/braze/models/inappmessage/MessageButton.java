package com.braze.models.inappmessage;

import android.graphics.Color;
import android.net.Uri;
import bo.app.va;
import bo.app.wa;
import com.braze.enums.inappmessage.ClickAction;
import com.braze.models.IPutIntoJson;
import com.braze.support.BrazeLogger;
import com.braze.support.BrazeLogger$$ExternalSyntheticLambda3;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0017\u0018\u0000 =2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u0001>B\u001d\b\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007Bc\b\u0012\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\t\u0012\b\b\u0001\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0001\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR$\u0010\n\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\"R$\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010%R(\u0010\u000e\u001a\u0004\u0018\u00010&2\b\u0010\u001f\u001a\u0004\u0018\u00010&8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010)R$\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010\u0010\u001a\u00020\t8\u0007@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010 \u001a\u0004\b4\u0010\"\"\u0004\b5\u00106R\"\u0010\u0011\u001a\u00020\t8\u0007@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010 \u001a\u0004\b7\u0010\"\"\u0004\b8\u00106R\"\u0010\u0014\u001a\u00020\t8\u0007@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010 \u001a\u0004\b9\u0010\"\"\u0004\b:\u00106R\u0011\u0010<\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b;\u0010,¨\u0006?"}, d2 = {"Lcom/braze/models/inappmessage/MessageButton;", "Lcom/braze/models/IPutIntoJson;", "Lorg/json/JSONObject;", "Lcom/braze/models/inappmessage/IInAppMessageThemeable;", "jsonObject", "darkThemeObject", "<init>", "(Lorg/json/JSONObject;Lorg/json/JSONObject;)V", "darkThemeJsonObject", "", "id", "Lcom/braze/enums/inappmessage/ClickAction;", "clickAction", "", "uri", "text", "backgroundColor", "textColor", "", "openUriInWebview", "borderColor", "(Lorg/json/JSONObject;Lorg/json/JSONObject;ILcom/braze/enums/inappmessage/ClickAction;Ljava/lang/String;Ljava/lang/String;IIZI)V", "", "enableDarkTheme", "()V", "forJsonPut", "()Lorg/json/JSONObject;", "Lorg/json/JSONObject;", "Lbo/app/wa;", "darkTheme", "Lbo/app/wa;", "value", "I", "getId", "()I", "Lcom/braze/enums/inappmessage/ClickAction;", "getClickAction", "()Lcom/braze/enums/inappmessage/ClickAction;", "Landroid/net/Uri;", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "Z", "getOpenUriInWebview", "()Z", "setOpenUriInWebview", "(Z)V", "getBackgroundColor", "setBackgroundColor", "(I)V", "getTextColor", "setTextColor", "getBorderColor", "setBorderColor", "getStringId", "stringId", "Companion", "bo/app/va", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public class MessageButton implements IPutIntoJson<JSONObject>, IInAppMessageThemeable {
    public static final va Companion = new va();
    private static final String TAG = BrazeLogger.getBrazeLogTag((Class<?>) MessageButton.class);
    private int backgroundColor;
    private int borderColor;
    private ClickAction clickAction;
    private wa darkTheme;
    private int id;
    private JSONObject jsonObject;
    private boolean openUriInWebview;
    private String text;
    private int textColor;
    private Uri uri;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MessageButton(JSONObject jSONObject, JSONObject jSONObject2) {
        this(jSONObject, jSONObject2, r5, r6, r7, r8, jSONObject.optInt("bg_color"), jSONObject.optInt("text_color"), jSONObject.optBoolean("use_webview", false), jSONObject.optInt("border_color"));
        ClickAction clickAction;
        String upperCase;
        int i;
        jSONObject.getClass();
        int optInt = jSONObject.optInt("id", -1);
        ClickAction clickAction2 = ClickAction.NONE;
        try {
            String string2 = jSONObject.getString("click_action");
            string2.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            upperCase = string2.toUpperCase(locale);
            upperCase.getClass();
        } catch (Exception unused) {
            clickAction = clickAction2;
        }
        for (ClickAction clickAction3 : ClickAction.values()) {
            if (Intrinsics.areEqual(clickAction3.name(), upperCase)) {
                clickAction = clickAction3;
                String optString = jSONObject.optString("uri");
                String optString2 = jSONObject.optString("text");
                optString2.getClass();
                return;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String enableDarkTheme$lambda$0$0() {
        return "Cannot apply dark theme with a null themes wrapper";
    }

    @Override // com.braze.models.inappmessage.IInAppMessageThemeable
    public void enableDarkTheme() {
        wa waVar = this.darkTheme;
        if (waVar == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeLogger$$ExternalSyntheticLambda3(12), 14, (Object) null);
            return;
        }
        Integer num = waVar.a;
        if (num != null) {
            this.backgroundColor = num.intValue();
        }
        Integer num2 = waVar.b;
        if (num2 != null) {
            this.textColor = num2.intValue();
        }
        Integer num3 = waVar.c;
        if (num3 != null) {
            this.borderColor = num3.intValue();
        }
    }

    @Override // com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut, reason: avoid collision after fix types in other method */
    public JSONObject getPropertiesJSONObject() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", this.id);
            jSONObject.put("click_action", this.clickAction.toString());
            Uri uri = this.uri;
            if (uri != null) {
                jSONObject.put("uri", String.valueOf(uri));
            }
            jSONObject.putOpt("text", this.text);
            jSONObject.put("bg_color", this.backgroundColor);
            jSONObject.put("text_color", this.textColor);
            jSONObject.put("use_webview", this.openUriInWebview);
            jSONObject.put("border_color", this.borderColor);
            return jSONObject;
        } catch (JSONException unused) {
            return this.jsonObject;
        }
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getBorderColor() {
        return this.borderColor;
    }

    public final ClickAction getClickAction() {
        return this.clickAction;
    }

    public final boolean getOpenUriInWebview() {
        return this.openUriInWebview;
    }

    public final String getStringId() {
        return String.valueOf(this.id);
    }

    public final String getText() {
        return this.text;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final Uri getUri() {
        return this.uri;
    }

    private MessageButton(JSONObject jSONObject, JSONObject jSONObject2, int i, ClickAction clickAction, String str, String str2, int i2, int i3, boolean z, int i4) {
        this.id = -1;
        this.clickAction = ClickAction.NONE;
        int parseColor = Color.parseColor("#1B78CF");
        this.backgroundColor = parseColor;
        this.textColor = -1;
        this.borderColor = parseColor;
        this.jsonObject = jSONObject;
        this.id = i;
        this.clickAction = clickAction;
        if (clickAction == ClickAction.URI && str != null && !StringsKt.isBlank(str)) {
            this.uri = Uri.parse(str);
        }
        this.text = str2;
        this.backgroundColor = i2;
        this.textColor = i3;
        this.openUriInWebview = z;
        this.borderColor = i4;
        this.darkTheme = jSONObject2 != null ? new wa(jSONObject2) : null;
    }
}
