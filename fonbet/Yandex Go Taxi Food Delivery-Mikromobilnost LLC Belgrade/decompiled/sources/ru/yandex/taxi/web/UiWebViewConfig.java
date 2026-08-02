package ru.yandex.taxi.web;

import android.os.Parcel;
import android.os.Parcelable;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.tse0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.web.CoreWebViewConfig;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\bN\b\u0007\u0018\u0000 q2\u00020\u0001:\u0005rstuvBï\u0001\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0006¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0013H\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b(\u0010&J\u001d\u0010,\u001a\u00020$2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u0013¢\u0006\u0004\b,\u0010-R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u0010&R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u00107\u001a\u0004\b<\u00109\"\u0004\b=\u0010;R\"\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u00107\u001a\u0004\b>\u00109\"\u0004\b?\u0010;R\"\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u00107\u001a\u0004\b@\u00109\"\u0004\bA\u0010;R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u00103\u001a\u0004\bB\u00105\"\u0004\bC\u0010&R\"\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u00107\u001a\u0004\bD\u00109\"\u0004\bE\u0010;R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u00107\u001a\u0004\b\r\u00109\"\u0004\bF\u0010;R$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u00103\u001a\u0004\bG\u00105\"\u0004\bH\u0010&R\"\u0010\u000f\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u00107\u001a\u0004\bI\u00109\"\u0004\bJ\u0010;R\"\u0010\u0010\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u00107\u001a\u0004\b\u0010\u00109\"\u0004\bK\u0010;R\"\u0010\u0012\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010V\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR(\u0010\u0017\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b\u0017\u0010[\u0012\u0004\b_\u0010`\u001a\u0004\b\\\u0010\"\"\u0004\b]\u0010^R(\u0010\u0018\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b\u0018\u0010[\u0012\u0004\bc\u0010`\u001a\u0004\ba\u0010\"\"\u0004\bb\u0010^R\"\u0010\u0019\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u00107\u001a\u0004\bd\u00109\"\u0004\be\u0010;R\"\u0010\u001a\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u00107\u001a\u0004\bf\u00109\"\u0004\bg\u0010;R\"\u0010\u001c\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\"\u0010\u001d\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u00107\u001a\u0004\bm\u00109\"\u0004\bn\u0010;R\"\u0010\u001e\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u00107\u001a\u0004\bo\u00109\"\u0004\bp\u0010;¨\u0006w"}, d2 = {"Lru/yandex/taxi/web/UiWebViewConfig;", "Landroid/os/Parcelable;", "Lru/yandex/taxi/web/CoreWebViewConfig;", "coreConfig", "", "businessName", "", "shouldShowCloseButton", "shouldShowToolbar", "shouldShowShareButton", "shouldSupportChat", "title", "hasTitleFromWeb", "isArrowHidden", "unsupportedText", "shouldUseCached", "isBackStackAware", "Lru/yandex/taxi/web/UiWebViewConfig$SignalForLoaded;", "signalForLoaded", "", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "", "modalViewCornerRadius", "closeButtonPosition", "titleHorizontalAlignment", "animateOnAppearing", "animateOnDisappearing", "Lru/yandex/taxi/web/UiWebViewConfig$ModalViewMode;", "modalViewMode", "canDrag", "considerSwipesHorizontalVelocity", "<init>", "(Lru/yandex/taxi/web/CoreWebViewConfig;Ljava/lang/String;ZZZZLjava/lang/String;ZZLjava/lang/String;ZZLru/yandex/taxi/web/UiWebViewConfig$SignalForLoaded;Ljava/lang/Integer;Ljava/lang/Float;IIZZLru/yandex/taxi/web/UiWebViewConfig$ModalViewMode;ZZ)V", "describeContents", "()I", "url", "Lzy11;", "withUrl", "(Ljava/lang/String;)V", "cachedOAuthToken", "withToken", "Landroid/os/Parcel;", "dest", "flags", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lru/yandex/taxi/web/CoreWebViewConfig;", "getCoreConfig", "()Lru/yandex/taxi/web/CoreWebViewConfig;", "setCoreConfig", "(Lru/yandex/taxi/web/CoreWebViewConfig;)V", "Ljava/lang/String;", "getBusinessName", "()Ljava/lang/String;", "setBusinessName", "Z", "getShouldShowCloseButton", "()Z", "setShouldShowCloseButton", "(Z)V", "getShouldShowToolbar", "setShouldShowToolbar", "getShouldShowShareButton", "setShouldShowShareButton", "getShouldSupportChat", "setShouldSupportChat", "getTitle", "setTitle", "getHasTitleFromWeb", "setHasTitleFromWeb", "setArrowHidden", "getUnsupportedText", "setUnsupportedText", "getShouldUseCached", "setShouldUseCached", "setBackStackAware", "Lru/yandex/taxi/web/UiWebViewConfig$SignalForLoaded;", "getSignalForLoaded", "()Lru/yandex/taxi/web/UiWebViewConfig$SignalForLoaded;", "setSignalForLoaded", "(Lru/yandex/taxi/web/UiWebViewConfig$SignalForLoaded;)V", "Ljava/lang/Integer;", "getBackgroundColor", "()Ljava/lang/Integer;", "setBackgroundColor", "(Ljava/lang/Integer;)V", "Ljava/lang/Float;", "getModalViewCornerRadius", "()Ljava/lang/Float;", "setModalViewCornerRadius", "(Ljava/lang/Float;)V", CA20Status.STATUS_USER_I, "getCloseButtonPosition", "setCloseButtonPosition", "(I)V", "getCloseButtonPosition$annotations", "()V", "getTitleHorizontalAlignment", "setTitleHorizontalAlignment", "getTitleHorizontalAlignment$annotations", "getAnimateOnAppearing", "setAnimateOnAppearing", "getAnimateOnDisappearing", "setAnimateOnDisappearing", "Lru/yandex/taxi/web/UiWebViewConfig$ModalViewMode;", "getModalViewMode", "()Lru/yandex/taxi/web/UiWebViewConfig$ModalViewMode;", "setModalViewMode", "(Lru/yandex/taxi/web/UiWebViewConfig$ModalViewMode;)V", "getCanDrag", "setCanDrag", "getConsiderSwipesHorizontalVelocity", "setConsiderSwipesHorizontalVelocity", "Companion", "ru/yandex/taxi/web/b", "ModalViewMode", "Fullscreen", "Slideable", "SignalForLoaded", "web"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UiWebViewConfig implements Parcelable {
    public static final String EXTRAS_CONFIG = "ru.yandex.taxi.activity.WebViewActivity.CONFIG";
    private boolean animateOnAppearing;
    private boolean animateOnDisappearing;
    private Integer backgroundColor;
    private String businessName;
    private boolean canDrag;
    private int closeButtonPosition;
    private boolean considerSwipesHorizontalVelocity;
    private CoreWebViewConfig coreConfig;
    private boolean hasTitleFromWeb;
    private boolean isArrowHidden;
    private boolean isBackStackAware;
    private Float modalViewCornerRadius;
    private ModalViewMode modalViewMode;
    private boolean shouldShowCloseButton;
    private boolean shouldShowShareButton;
    private boolean shouldShowToolbar;
    private boolean shouldSupportChat;
    private boolean shouldUseCached;
    private SignalForLoaded signalForLoaded;
    private String title;
    private int titleHorizontalAlignment;
    private String unsupportedText;
    public static final b Companion = new b();
    public static final Parcelable.Creator<UiWebViewConfig> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lru/yandex/taxi/web/UiWebViewConfig$ModalViewMode;", "Landroid/os/Parcelable;", "Lru/yandex/taxi/web/UiWebViewConfig$Fullscreen;", "Lru/yandex/taxi/web/UiWebViewConfig$Slideable;", "web"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface ModalViewMode extends Parcelable {
    }

    public /* synthetic */ UiWebViewConfig(CoreWebViewConfig coreWebViewConfig, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5, boolean z6, String str3, boolean z7, boolean z8, SignalForLoaded signalForLoaded, Integer num, Float f, int i, int i2, boolean z9, boolean z10, ModalViewMode modalViewMode, boolean z11, boolean z12, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? new CoreWebViewConfig.a().a() : coreWebViewConfig, (i3 & 2) != 0 ? null : str, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? true : z2, (i3 & 16) != 0 ? false : z3, (i3 & 32) != 0 ? false : z4, (i3 & 64) != 0 ? null : str2, (i3 & 128) != 0 ? false : z5, (i3 & 256) != 0 ? false : z6, (i3 & 512) != 0 ? null : str3, (i3 & 1024) != 0 ? false : z7, (i3 & 2048) != 0 ? false : z8, (i3 & 4096) != 0 ? SignalForLoaded.Default.INSTANCE : signalForLoaded, (i3 & 8192) != 0 ? null : num, (i3 & 16384) != 0 ? null : f, (i3 & 32768) != 0 ? 0 : i, (i3 & 65536) != 0 ? 0 : i2, (i3 & 131072) != 0 ? true : z9, (i3 & 262144) != 0 ? true : z10, (i3 & 524288) != 0 ? Fullscreen.INSTANCE : modalViewMode, (i3 & 1048576) != 0 ? true : z11, (i3 & 2097152) != 0 ? false : z12);
    }

    public static /* synthetic */ void getCloseButtonPosition$annotations() {
    }

    public static /* synthetic */ void getTitleHorizontalAlignment$annotations() {
    }

    public static final UiWebViewConfig webUrlWithAuthHeaderConfig(String str, String str2, String str3, boolean z, boolean z2) {
        Companion.getClass();
        return b.a(str, str2, str3, z, z2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final boolean getAnimateOnAppearing() {
        return this.animateOnAppearing;
    }

    public final boolean getAnimateOnDisappearing() {
        return this.animateOnDisappearing;
    }

    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getBusinessName() {
        return this.businessName;
    }

    public final boolean getCanDrag() {
        return this.canDrag;
    }

    public final int getCloseButtonPosition() {
        return this.closeButtonPosition;
    }

    public final boolean getConsiderSwipesHorizontalVelocity() {
        return this.considerSwipesHorizontalVelocity;
    }

    public final CoreWebViewConfig getCoreConfig() {
        return this.coreConfig;
    }

    public final boolean getHasTitleFromWeb() {
        return this.hasTitleFromWeb;
    }

    public final Float getModalViewCornerRadius() {
        return this.modalViewCornerRadius;
    }

    public final ModalViewMode getModalViewMode() {
        return this.modalViewMode;
    }

    public final boolean getShouldShowCloseButton() {
        return this.shouldShowCloseButton;
    }

    public final boolean getShouldShowShareButton() {
        return this.shouldShowShareButton;
    }

    public final boolean getShouldShowToolbar() {
        return this.shouldShowToolbar;
    }

    public final boolean getShouldSupportChat() {
        return this.shouldSupportChat;
    }

    public final boolean getShouldUseCached() {
        return this.shouldUseCached;
    }

    public final SignalForLoaded getSignalForLoaded() {
        return this.signalForLoaded;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getTitleHorizontalAlignment() {
        return this.titleHorizontalAlignment;
    }

    public final String getUnsupportedText() {
        return this.unsupportedText;
    }

    /* renamed from: isArrowHidden, reason: from getter */
    public final boolean getIsArrowHidden() {
        return this.isArrowHidden;
    }

    /* renamed from: isBackStackAware, reason: from getter */
    public final boolean getIsBackStackAware() {
        return this.isBackStackAware;
    }

    public final void setAnimateOnAppearing(boolean z) {
        this.animateOnAppearing = z;
    }

    public final void setAnimateOnDisappearing(boolean z) {
        this.animateOnDisappearing = z;
    }

    public final void setArrowHidden(boolean z) {
        this.isArrowHidden = z;
    }

    public final void setBackStackAware(boolean z) {
        this.isBackStackAware = z;
    }

    public final void setBackgroundColor(Integer num) {
        this.backgroundColor = num;
    }

    public final void setBusinessName(String str) {
        this.businessName = str;
    }

    public final void setCanDrag(boolean z) {
        this.canDrag = z;
    }

    public final void setCloseButtonPosition(int i) {
        this.closeButtonPosition = i;
    }

    public final void setConsiderSwipesHorizontalVelocity(boolean z) {
        this.considerSwipesHorizontalVelocity = z;
    }

    public final void setCoreConfig(CoreWebViewConfig coreWebViewConfig) {
        this.coreConfig = coreWebViewConfig;
    }

    public final void setHasTitleFromWeb(boolean z) {
        this.hasTitleFromWeb = z;
    }

    public final void setModalViewCornerRadius(Float f) {
        this.modalViewCornerRadius = f;
    }

    public final void setModalViewMode(ModalViewMode modalViewMode) {
        this.modalViewMode = modalViewMode;
    }

    public final void setShouldShowCloseButton(boolean z) {
        this.shouldShowCloseButton = z;
    }

    public final void setShouldShowShareButton(boolean z) {
        this.shouldShowShareButton = z;
    }

    public final void setShouldShowToolbar(boolean z) {
        this.shouldShowToolbar = z;
    }

    public final void setShouldSupportChat(boolean z) {
        this.shouldSupportChat = z;
    }

    public final void setShouldUseCached(boolean z) {
        this.shouldUseCached = z;
    }

    public final void setSignalForLoaded(SignalForLoaded signalForLoaded) {
        this.signalForLoaded = signalForLoaded;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTitleHorizontalAlignment(int i) {
        this.titleHorizontalAlignment = i;
    }

    public final void setUnsupportedText(String str) {
        this.unsupportedText = str;
    }

    public final void withToken(String cachedOAuthToken) {
        this.coreConfig.updateToken(cachedOAuthToken);
    }

    public final void withUrl(String url) {
        this.coreConfig.updateUrl(url);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        this.coreConfig.writeToParcel(dest, flags);
        dest.writeString(this.businessName);
        dest.writeInt(this.shouldShowCloseButton ? 1 : 0);
        dest.writeInt(this.shouldShowToolbar ? 1 : 0);
        dest.writeInt(this.shouldShowShareButton ? 1 : 0);
        dest.writeInt(this.shouldSupportChat ? 1 : 0);
        dest.writeString(this.title);
        dest.writeInt(this.hasTitleFromWeb ? 1 : 0);
        dest.writeInt(this.isArrowHidden ? 1 : 0);
        dest.writeString(this.unsupportedText);
        dest.writeInt(this.shouldUseCached ? 1 : 0);
        dest.writeInt(this.isBackStackAware ? 1 : 0);
        dest.writeParcelable(this.signalForLoaded, flags);
        Integer num = this.backgroundColor;
        if (num == null) {
            dest.writeInt(0);
        } else {
            tse0.v(dest, 1, num);
        }
        Float f = this.modalViewCornerRadius;
        if (f == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeFloat(f.floatValue());
        }
        dest.writeInt(this.closeButtonPosition);
        dest.writeInt(this.titleHorizontalAlignment);
        dest.writeInt(this.animateOnAppearing ? 1 : 0);
        dest.writeInt(this.animateOnDisappearing ? 1 : 0);
        dest.writeParcelable(this.modalViewMode, flags);
        dest.writeInt(this.canDrag ? 1 : 0);
        dest.writeInt(this.considerSwipesHorizontalVelocity ? 1 : 0);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\tÊ\u0001\u0002\b\u000b¨\u0006\n"}, d2 = {"Lru/yandex/taxi/web/UiWebViewConfig$SignalForLoaded;", "Landroid/os/Parcelable;", "<init>", "()V", "Default", "External", "OnCommitVisible", "Lru/yandex/taxi/web/UiWebViewConfig$SignalForLoaded$Default;", "Lru/yandex/taxi/web/UiWebViewConfig$SignalForLoaded$External;", "Lru/yandex/taxi/web/UiWebViewConfig$SignalForLoaded$OnCommitVisible;", "web", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static abstract class SignalForLoaded implements Parcelable {
        public /* synthetic */ SignalForLoaded(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/yandex/taxi/web/UiWebViewConfig$SignalForLoaded$Default;", "Lru/yandex/taxi/web/UiWebViewConfig$SignalForLoaded;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "web"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class Default extends SignalForLoaded {
            public static final Default INSTANCE = new Default();
            public static final Parcelable.Creator<Default> CREATOR = new Creator();

            private Default() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(1);
            }

            @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Default> {
                @Override // android.os.Parcelable.Creator
                public final Default createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return Default.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final Default[] newArray(int i) {
                    return new Default[i];
                }
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/yandex/taxi/web/UiWebViewConfig$SignalForLoaded$External;", "Lru/yandex/taxi/web/UiWebViewConfig$SignalForLoaded;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "web"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class External extends SignalForLoaded {
            public static final External INSTANCE = new External();
            public static final Parcelable.Creator<External> CREATOR = new Creator();

            private External() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(1);
            }

            @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<External> {
                @Override // android.os.Parcelable.Creator
                public final External createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return External.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final External[] newArray(int i) {
                    return new External[i];
                }
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/yandex/taxi/web/UiWebViewConfig$SignalForLoaded$OnCommitVisible;", "Lru/yandex/taxi/web/UiWebViewConfig$SignalForLoaded;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "web"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final class OnCommitVisible extends SignalForLoaded {
            public static final OnCommitVisible INSTANCE = new OnCommitVisible();
            public static final Parcelable.Creator<OnCommitVisible> CREATOR = new Creator();

            private OnCommitVisible() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(1);
            }

            @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<OnCommitVisible> {
                @Override // android.os.Parcelable.Creator
                public final OnCommitVisible createFromParcel(Parcel parcel) {
                    parcel.readInt();
                    return OnCommitVisible.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final OnCommitVisible[] newArray(int i) {
                    return new OnCommitVisible[i];
                }
            }
        }

        private SignalForLoaded() {
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/yandex/taxi/web/UiWebViewConfig$Fullscreen;", "Lru/yandex/taxi/web/UiWebViewConfig$ModalViewMode;", "<init>", "()V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "web"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Fullscreen implements ModalViewMode {
        public static final Fullscreen INSTANCE = new Fullscreen();
        public static final Parcelable.Creator<Fullscreen> CREATOR = new Creator();

        private Fullscreen() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Fullscreen);
        }

        public int hashCode() {
            return -2076234886;
        }

        public String toString() {
            return "Fullscreen";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(1);
        }

        @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Fullscreen> {
            @Override // android.os.Parcelable.Creator
            public final Fullscreen createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Fullscreen.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Fullscreen[] newArray(int i) {
                return new Fullscreen[i];
            }
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0019\u0010\u0014¨\u0006\u001a"}, d2 = {"Lru/yandex/taxi/web/UiWebViewConfig$Slideable;", "Lru/yandex/taxi/web/UiWebViewConfig$ModalViewMode;", "", "useFloatingButtonForNavigation", "", "anchorHeight", "fixed", "statusBarOnly", "<init>", "(ZLjava/lang/Integer;ZZ)V", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getUseFloatingButtonForNavigation", "()Z", "Ljava/lang/Integer;", "getAnchorHeight", "()Ljava/lang/Integer;", "getFixed", "getStatusBarOnly", "web"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Slideable implements ModalViewMode {
        public static final Parcelable.Creator<Slideable> CREATOR = new Creator();
        private final Integer anchorHeight;
        private final boolean fixed;
        private final boolean statusBarOnly;
        private final boolean useFloatingButtonForNavigation;

        public /* synthetic */ Slideable(boolean z, Integer num, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, (i & 2) != 0 ? null : num, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final Integer getAnchorHeight() {
            return this.anchorHeight;
        }

        public final boolean getFixed() {
            return this.fixed;
        }

        public final boolean getStatusBarOnly() {
            return this.statusBarOnly;
        }

        public final boolean getUseFloatingButtonForNavigation() {
            return this.useFloatingButtonForNavigation;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.useFloatingButtonForNavigation ? 1 : 0);
            Integer num = this.anchorHeight;
            if (num == null) {
                dest.writeInt(0);
            } else {
                tse0.v(dest, 1, num);
            }
            dest.writeInt(this.fixed ? 1 : 0);
            dest.writeInt(this.statusBarOnly ? 1 : 0);
        }

        @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Slideable> {
            @Override // android.os.Parcelable.Creator
            public final Slideable createFromParcel(Parcel parcel) {
                return new Slideable(parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Slideable[] newArray(int i) {
                return new Slideable[i];
            }
        }

        public Slideable(boolean z, Integer num, boolean z2, boolean z3) {
            this.useFloatingButtonForNavigation = z;
            this.anchorHeight = num;
            this.fixed = z2;
            this.statusBarOnly = z3;
        }
    }

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class Creator implements Parcelable.Creator<UiWebViewConfig> {
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
            	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
            	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
            */
        @Override // android.os.Parcelable.Creator
        public final ru.yandex.taxi.web.UiWebViewConfig createFromParcel(
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r25v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
            	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
            	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
            */

        @Override // android.os.Parcelable.Creator
        public final UiWebViewConfig[] newArray(int i) {
            return new UiWebViewConfig[i];
        }
    }

    public UiWebViewConfig(CoreWebViewConfig coreWebViewConfig) {
        this(coreWebViewConfig, null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194302, null);
    }

    public UiWebViewConfig(CoreWebViewConfig coreWebViewConfig, String str) {
        this(coreWebViewConfig, str, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194300, null);
    }

    public UiWebViewConfig(CoreWebViewConfig coreWebViewConfig, String str, boolean z) {
        this(coreWebViewConfig, str, z, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194296, null);
    }

    public UiWebViewConfig(CoreWebViewConfig coreWebViewConfig, String str, boolean z, boolean z2) {
        this(coreWebViewConfig, str, z, z2, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194288, null);
    }

    public UiWebViewConfig(CoreWebViewConfig coreWebViewConfig, String str, boolean z, boolean z2, boolean z3) {
        this(coreWebViewConfig, str, z, z2, z3, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194272, null);
    }

    public UiWebViewConfig(CoreWebViewConfig coreWebViewConfig, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        this(coreWebViewConfig, str, z, z2, z3, z4, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194240, null);
    }

    public UiWebViewConfig(CoreWebViewConfig coreWebViewConfig, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2) {
        this(coreWebViewConfig, str, z, z2, z3, z4, str2, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194176, null);
    }

    public UiWebViewConfig(CoreWebViewConfig coreWebViewConfig, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5) {
        this(coreWebViewConfig, str, z, z2, z3, z4, str2, z5, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194048, null);
    }

    public UiWebViewConfig(CoreWebViewConfig coreWebViewConfig, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5, boolean z6) {
        this(coreWebViewConfig, str, z, z2, z3, z4, str2, z5, z6, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4193792, null);
    }

    public UiWebViewConfig(CoreWebViewConfig coreWebViewConfig, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5, boolean z6, String str3) {
        this(coreWebViewConfig, str, z, z2, z3, z4, str2, z5, z6, str3, false, false, null, null, null, 0, 0, false, false, null, false, false, 4193280, null);
    }

    public UiWebViewConfig(CoreWebViewConfig coreWebViewConfig, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5, boolean z6, String str3, boolean z7) {
        this(coreWebViewConfig, str, z, z2, z3, z4, str2, z5, z6, str3, z7, false, null, null, null, 0, 0, false, false, null, false, false, 4192256, null);
    }

    public UiWebViewConfig(CoreWebViewConfig coreWebViewConfig, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5, boolean z6, String str3, boolean z7, boolean z8) {
        this(coreWebViewConfig, str, z, z2, z3, z4, str2, z5, z6, str3, z7, z8, null, null, null, 0, 0, false, false, null, false, false, 4190208, null);
    }

    public UiWebViewConfig(CoreWebViewConfig coreWebViewConfig, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5, boolean z6, String str3, boolean z7, boolean z8, SignalForLoaded signalForLoaded) {
        this(coreWebViewConfig, str, z, z2, z3, z4, str2, z5, z6, str3, z7, z8, signalForLoaded, null, null, 0, 0, false, false, null, false, false, 4186112, null);
    }

    public UiWebViewConfig(CoreWebViewConfig coreWebViewConfig, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5, boolean z6, String str3, boolean z7, boolean z8, SignalForLoaded signalForLoaded, Integer num) {
        this(coreWebViewConfig, str, z, z2, z3, z4, str2, z5, z6, str3, z7, z8, signalForLoaded, num, null, 0, 0, false, false, null, false, false, 4177920, null);
    }

    public UiWebViewConfig(CoreWebViewConfig coreWebViewConfig, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5, boolean z6, String str3, boolean z7, boolean z8, SignalForLoaded signalForLoaded, Integer num, Float f) {
        this(coreWebViewConfig, str, z, z2, z3, z4, str2, z5, z6, str3, z7, z8, signalForLoaded, num, f, 0, 0, false, false, null, false, false, 4161536, null);
    }

    public UiWebViewConfig(CoreWebViewConfig coreWebViewConfig, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5, boolean z6, String str3, boolean z7, boolean z8, SignalForLoaded signalForLoaded, Integer num, Float f, int i) {
        this(coreWebViewConfig, str, z, z2, z3, z4, str2, z5, z6, str3, z7, z8, signalForLoaded, num, f, i, 0, false, false, null, false, false, 4128768, null);
    }

    public UiWebViewConfig(CoreWebViewConfig coreWebViewConfig, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5, boolean z6, String str3, boolean z7, boolean z8, SignalForLoaded signalForLoaded, Integer num, Float f, int i, int i2) {
        this(coreWebViewConfig, str, z, z2, z3, z4, str2, z5, z6, str3, z7, z8, signalForLoaded, num, f, i, i2, false, false, null, false, false, 4063232, null);
    }

    public UiWebViewConfig(CoreWebViewConfig coreWebViewConfig, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5, boolean z6, String str3, boolean z7, boolean z8, SignalForLoaded signalForLoaded, Integer num, Float f, int i, int i2, boolean z9) {
        this(coreWebViewConfig, str, z, z2, z3, z4, str2, z5, z6, str3, z7, z8, signalForLoaded, num, f, i, i2, z9, false, null, false, false, 3932160, null);
    }

    public UiWebViewConfig(CoreWebViewConfig coreWebViewConfig, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5, boolean z6, String str3, boolean z7, boolean z8, SignalForLoaded signalForLoaded, Integer num, Float f, int i, int i2, boolean z9, boolean z10) {
        this(coreWebViewConfig, str, z, z2, z3, z4, str2, z5, z6, str3, z7, z8, signalForLoaded, num, f, i, i2, z9, z10, null, false, false, 3670016, null);
    }

    public UiWebViewConfig(CoreWebViewConfig coreWebViewConfig, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5, boolean z6, String str3, boolean z7, boolean z8, SignalForLoaded signalForLoaded, Integer num, Float f, int i, int i2, boolean z9, boolean z10, ModalViewMode modalViewMode) {
        this(coreWebViewConfig, str, z, z2, z3, z4, str2, z5, z6, str3, z7, z8, signalForLoaded, num, f, i, i2, z9, z10, modalViewMode, false, false, 3145728, null);
    }

    public UiWebViewConfig(CoreWebViewConfig coreWebViewConfig, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5, boolean z6, String str3, boolean z7, boolean z8, SignalForLoaded signalForLoaded, Integer num, Float f, int i, int i2, boolean z9, boolean z10, ModalViewMode modalViewMode, boolean z11) {
        this(coreWebViewConfig, str, z, z2, z3, z4, str2, z5, z6, str3, z7, z8, signalForLoaded, num, f, i, i2, z9, z10, modalViewMode, z11, false, 2097152, null);
    }

    public UiWebViewConfig(CoreWebViewConfig coreWebViewConfig, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, boolean z5, boolean z6, String str3, boolean z7, boolean z8, SignalForLoaded signalForLoaded, Integer num, Float f, int i, int i2, boolean z9, boolean z10, ModalViewMode modalViewMode, boolean z11, boolean z12) {
        this.coreConfig = coreWebViewConfig;
        this.businessName = str;
        this.shouldShowCloseButton = z;
        this.shouldShowToolbar = z2;
        this.shouldShowShareButton = z3;
        this.shouldSupportChat = z4;
        this.title = str2;
        this.hasTitleFromWeb = z5;
        this.isArrowHidden = z6;
        this.unsupportedText = str3;
        this.shouldUseCached = z7;
        this.isBackStackAware = z8;
        this.signalForLoaded = signalForLoaded;
        this.backgroundColor = num;
        this.modalViewCornerRadius = f;
        this.closeButtonPosition = i;
        this.titleHorizontalAlignment = i2;
        this.animateOnAppearing = z9;
        this.animateOnDisappearing = z10;
        this.modalViewMode = modalViewMode;
        this.canDrag = z11;
        this.considerSwipesHorizontalVelocity = z12;
    }

    public UiWebViewConfig() {
        this(null, null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 4194303, null);
    }
}
