package com.braze.models.inappmessage;

import android.graphics.Color;
import bo.app.a9;
import bo.app.e2;
import bo.app.fa;
import bo.app.ha;
import bo.app.hg;
import bo.app.ia;
import bo.app.j1;
import bo.app.ja;
import bo.app.k1;
import bo.app.ma;
import bo.app.y8;
import com.braze.enums.inappmessage.ImageStyle;
import com.braze.enums.inappmessage.TextAlign;
import com.braze.support.BrazeLogger;
import com.braze.support.BrazeLogger$$ExternalSyntheticLambda3;
import com.braze.support.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyIterator;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.TransformingSequence$iterator$1;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\u001c\b'\u0018\u0000 E2\u00020\u00012\u00020\u0002:\u0001FB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bBI\b\u0012\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0007\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010\f\u001a\u00020\u000b8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010\r\u001a\u00020\u000b8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u001f\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R$\u0010\n\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R(\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00140+8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010\u000f\u001a\u00020\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00107\u001a\u0004\u0018\u00010\u000b8\u0016@\u0016X\u0097\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010\u0011\u001a\u00020\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010D\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010&¨\u0006G"}, d2 = {"Lcom/braze/models/inappmessage/InAppMessageImmersiveBase;", "Lcom/braze/models/inappmessage/InAppMessageWithImageBase;", "Lcom/braze/models/inappmessage/IInAppMessageImmersive;", "Lorg/json/JSONObject;", "jsonObject", "Lbo/app/a9;", "brazeManager", "<init>", "(Lorg/json/JSONObject;Lbo/app/a9;)V", "", "header", "", "headerTextColor", "closeButtonColor", "Lcom/braze/enums/inappmessage/ImageStyle;", "imageStyle", "Lcom/braze/enums/inappmessage/TextAlign;", "headerTextAlign", "messageTextAlign", "(Lorg/json/JSONObject;Lbo/app/a9;Ljava/lang/String;IILcom/braze/enums/inappmessage/ImageStyle;Lcom/braze/enums/inappmessage/TextAlign;Lcom/braze/enums/inappmessage/TextAlign;)V", "Lcom/braze/models/inappmessage/MessageButton;", "messageButton", "", "logButtonClick", "(Lcom/braze/models/inappmessage/MessageButton;)Z", "", "onAfterClosed", "()V", "enableDarkTheme", "forJsonPut", "()Lorg/json/JSONObject;", "I", "getHeaderTextColor", "()I", "setHeaderTextColor", "(I)V", "getCloseButtonColor", "setCloseButtonColor", "Ljava/lang/String;", "getHeader", "()Ljava/lang/String;", "setHeader", "(Ljava/lang/String;)V", "", "messageButtons", "Ljava/util/List;", "getMessageButtons", "()Ljava/util/List;", "setMessageButtons", "(Ljava/util/List;)V", "Lcom/braze/enums/inappmessage/ImageStyle;", "getImageStyle", "()Lcom/braze/enums/inappmessage/ImageStyle;", "setImageStyle", "(Lcom/braze/enums/inappmessage/ImageStyle;)V", "frameColor", "Ljava/lang/Integer;", "getFrameColor", "()Ljava/lang/Integer;", "setFrameColor", "(Ljava/lang/Integer;)V", "Lcom/braze/enums/inappmessage/TextAlign;", "getHeaderTextAlign", "()Lcom/braze/enums/inappmessage/TextAlign;", "setHeaderTextAlign", "(Lcom/braze/enums/inappmessage/TextAlign;)V", "wasButtonClickLogged", "Z", "buttonIdClicked", "Companion", "bo/app/ha", "android-sdk-base_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class InAppMessageImmersiveBase extends InAppMessageWithImageBase implements IInAppMessageImmersive {
    public static final ha Companion = new ha();
    private String buttonIdClicked;
    private int closeButtonColor;
    private Integer frameColor;
    private String header;
    private TextAlign headerTextAlign;
    private int headerTextColor;
    private ImageStyle imageStyle;
    private List<? extends MessageButton> messageButtons;
    private boolean wasButtonClickLogged;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InAppMessageImmersiveBase(JSONObject jSONObject, a9 a9Var) {
        this(jSONObject, a9Var, r3, r4, r5, r6, r7, r8);
        Iterator transformingSequence$iterator$1;
        JSONObject optJSONObject;
        String upperCase;
        int i;
        String upperCase2;
        int i2;
        String upperCase3;
        int i3;
        jSONObject.getClass();
        a9Var.getClass();
        String optString = jSONObject.optString("header");
        optString.getClass();
        int optInt = jSONObject.optInt("header_text_color");
        int optInt2 = jSONObject.optInt("close_btn_color");
        ImageStyle imageStyle = ImageStyle.TOP;
        int i4 = 0;
        try {
            String string2 = jSONObject.getString("image_style");
            string2.getClass();
            Locale locale = Locale.US;
            locale.getClass();
            upperCase3 = string2.toUpperCase(locale);
            upperCase3.getClass();
        } catch (Exception unused) {
        }
        for (ImageStyle imageStyle2 : ImageStyle.values()) {
            if (Intrinsics.areEqual(imageStyle2.name(), upperCase3)) {
                imageStyle = imageStyle2;
                TextAlign textAlign = TextAlign.CENTER;
                try {
                    String string3 = jSONObject.getString("text_align_header");
                    string3.getClass();
                    Locale locale2 = Locale.US;
                    locale2.getClass();
                    upperCase2 = string3.toUpperCase(locale2);
                    upperCase2.getClass();
                } catch (Exception unused2) {
                }
                for (TextAlign textAlign2 : TextAlign.values()) {
                    if (Intrinsics.areEqual(textAlign2.name(), upperCase2)) {
                        textAlign = textAlign2;
                        TextAlign textAlign3 = TextAlign.CENTER;
                        try {
                            String string4 = jSONObject.getString("text_align_message");
                            string4.getClass();
                            Locale locale3 = Locale.US;
                            locale3.getClass();
                            upperCase = string4.toUpperCase(locale3);
                            upperCase.getClass();
                        } catch (Exception unused3) {
                        }
                        for (TextAlign textAlign4 : TextAlign.values()) {
                            if (Intrinsics.areEqual(textAlign4.name(), upperCase)) {
                                textAlign3 = textAlign4;
                                JSONArray optJSONArray = jSONObject.optJSONArray("btns");
                                String str = i.a;
                                JSONObject optJSONObject2 = jSONObject.optJSONObject("themes");
                                JSONArray jSONArray = (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject("dark")) == null || (jSONArray = optJSONObject.optJSONArray("btns")) == null) ? new JSONArray() : jSONArray;
                                ArrayList arrayList = new ArrayList();
                                if (optJSONArray == null) {
                                    EmptyList.INSTANCE.getClass();
                                    transformingSequence$iterator$1 = EmptyIterator.INSTANCE;
                                } else {
                                    transformingSequence$iterator$1 = new TransformingSequence$iterator$1(SequencesKt___SequencesKt.map(SequencesKt___SequencesKt.filter(CollectionsKt.asSequence(RangesKt___RangesKt.until(0, optJSONArray.length())), new ia(optJSONArray)), new ja(optJSONArray)));
                                }
                                transformingSequence$iterator$1.getClass();
                                while (transformingSequence$iterator$1.hasNext()) {
                                    int i5 = i4 + 1;
                                    if (i4 < 0) {
                                        CollectionsKt__CollectionsKt.throwIndexOverflow();
                                        throw null;
                                    }
                                    arrayList.add(new MessageButton((JSONObject) transformingSequence$iterator$1.next(), jSONArray.optJSONObject(i4)));
                                    i4 = i5;
                                }
                                setMessageButtons(arrayList);
                                return;
                            }
                        }
                        throw new NoSuchElementException("Array contains no element matching the predicate.");
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String enableDarkTheme$lambda$0() {
        return "Cannot apply dark theme with a null themes wrapper";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$0() {
        return "Trigger id not found (this is expected for test sends). Not logging button click.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$1() {
        return "Button click already logged for this message. Ignoring.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String logButtonClick$lambda$2() {
        return "Cannot log a button click because the BrazeManager is null.";
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessageThemeable
    public void enableDarkTheme() {
        super.enableDarkTheme();
        ma inAppMessageDarkThemeWrapper = getInAppMessageDarkThemeWrapper();
        if (inAppMessageDarkThemeWrapper == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeLogger$$ExternalSyntheticLambda3(6), 7, (Object) null);
            return;
        }
        Integer num = inAppMessageDarkThemeWrapper.g;
        if (num != null) {
            setFrameColor(num);
        }
        Integer num2 = inAppMessageDarkThemeWrapper.c;
        if (num2 != null) {
            setCloseButtonColor(num2.intValue());
        }
        Integer num3 = inAppMessageDarkThemeWrapper.f;
        if (num3 != null) {
            setHeaderTextColor(num3.intValue());
        }
        Iterator<MessageButton> it = getMessageButtons().iterator();
        while (it.hasNext()) {
            it.next().enableDarkTheme();
        }
    }

    @Override // com.braze.models.inappmessage.InAppMessageWithImageBase, com.braze.models.inappmessage.InAppMessageBase, com.braze.models.IPutIntoJson
    /* renamed from: forJsonPut */
    public JSONObject getValue() {
        JSONObject jsonObject = getJsonObject();
        if (jsonObject != null) {
            return jsonObject;
        }
        JSONObject value = super.getValue();
        try {
            value.putOpt("header", getHeader());
            value.put("header_text_color", getHeaderTextColor());
            value.put("close_btn_color", getCloseButtonColor());
            value.putOpt("image_style", getImageStyle().toString());
            value.putOpt("text_align_header", getHeaderTextAlign().toString());
            Integer frameColor = getFrameColor();
            if (frameColor != null) {
                value.put("frame_color", frameColor.intValue());
            }
            JSONArray jSONArray = new JSONArray();
            Iterator<MessageButton> it = getMessageButtons().iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().getValue());
            }
            value.put("btns", jSONArray);
        } catch (JSONException unused) {
        }
        return value;
    }

    public int getCloseButtonColor() {
        return this.closeButtonColor;
    }

    public Integer getFrameColor() {
        return this.frameColor;
    }

    public String getHeader() {
        return this.header;
    }

    public TextAlign getHeaderTextAlign() {
        return this.headerTextAlign;
    }

    public int getHeaderTextColor() {
        return this.headerTextColor;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public ImageStyle getImageStyle() {
        return this.imageStyle;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public List<MessageButton> getMessageButtons() {
        return this.messageButtons;
    }

    @Override // com.braze.models.inappmessage.IInAppMessageImmersive
    public boolean logButtonClick(MessageButton messageButton) {
        messageButton.getClass();
        a9 brazeManager = getBrazeManager();
        String triggerId = getTriggerId();
        if (triggerId == null || StringsKt.isBlank(triggerId)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, (Function0) new BrazeLogger$$ExternalSyntheticLambda3(9), 7, (Object) null);
            return false;
        }
        if (this.wasButtonClickLogged) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, (Function0) new BrazeLogger$$ExternalSyntheticLambda3(7), 6, (Object) null);
            return false;
        }
        if (brazeManager == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new BrazeLogger$$ExternalSyntheticLambda3(8), 6, (Object) null);
            return false;
        }
        this.buttonIdClicked = messageButton.getStringId();
        j1 j1Var = k1.g;
        j1Var.getClass();
        y8 i = j1Var.i(triggerId, messageButton.getStringId());
        if (i != null) {
            ((e2) brazeManager).a(i);
        }
        this.wasButtonClickLogged = true;
        return true;
    }

    @Override // com.braze.models.inappmessage.InAppMessageBase, com.braze.models.inappmessage.IInAppMessage
    public void onAfterClosed() {
        String triggerId;
        String str;
        super.onAfterClosed();
        a9 brazeManager = getBrazeManager();
        if (!this.wasButtonClickLogged || (triggerId = getTriggerId()) == null || StringsKt.isBlank(triggerId) || (str = this.buttonIdClicked) == null || StringsKt.isBlank(str) || brazeManager == null) {
            return;
        }
        ((e2) brazeManager).d.b(new hg(new fa(getTriggerId(), this.buttonIdClicked)), hg.class);
    }

    public void setCloseButtonColor(int i) {
        this.closeButtonColor = i;
    }

    public void setFrameColor(Integer num) {
        this.frameColor = num;
    }

    public void setHeader(String str) {
        this.header = str;
    }

    public void setHeaderTextAlign(TextAlign textAlign) {
        textAlign.getClass();
        this.headerTextAlign = textAlign;
    }

    public void setHeaderTextColor(int i) {
        this.headerTextColor = i;
    }

    public void setImageStyle(ImageStyle imageStyle) {
        imageStyle.getClass();
        this.imageStyle = imageStyle;
    }

    public void setMessageButtons(List<? extends MessageButton> list) {
        list.getClass();
        this.messageButtons = list;
    }

    private InAppMessageImmersiveBase(JSONObject jSONObject, a9 a9Var, String str, int i, int i2, ImageStyle imageStyle, TextAlign textAlign, TextAlign textAlign2) {
        super(jSONObject, a9Var);
        this.headerTextColor = Color.parseColor("#333333");
        this.closeButtonColor = Color.parseColor("#9B9B9B");
        this.messageButtons = EmptyList.INSTANCE;
        this.imageStyle = ImageStyle.TOP;
        this.headerTextAlign = TextAlign.CENTER;
        setHeader(str);
        setHeaderTextColor(i);
        setCloseButtonColor(i2);
        if (jSONObject.has("frame_color")) {
            setFrameColor(Integer.valueOf(jSONObject.optInt("frame_color")));
        }
        setImageStyle(imageStyle);
        setHeaderTextAlign(textAlign);
        setMessageTextAlign(textAlign2);
    }
}
