package com.yandex.music.shared.slides.ui.music.logic.impl.network.model;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import com.yandex.music.shared.slides.ui.music.logic.impl.network.model.content.SlideContentDto;
import io.appmetrica.analytics.impl.C0479n3;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0081\b\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/SlideDto;", "", "", ConnectableDevice.KEY_ID, "Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/SlideBackgroundDto;", C0479n3.g, "promoLogo", "Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/SlideButtonDto;", "button", "Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/content/SlideContentDto;", "content", "Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/SlideTrailerDto;", "trailer", "Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/SlideMetaDto;", "meta", "<init>", "(Ljava/lang/String;Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/SlideBackgroundDto;Ljava/lang/String;Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/SlideButtonDto;Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/content/SlideContentDto;Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/SlideTrailerDto;Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/SlideMetaDto;)V", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/SlideBackgroundDto;", "a", "()Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/SlideBackgroundDto;", "f", "Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/SlideButtonDto;", "b", "()Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/SlideButtonDto;", "Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/content/SlideContentDto;", "c", "()Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/content/SlideContentDto;", "Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/SlideTrailerDto;", "g", "()Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/SlideTrailerDto;", "Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/SlideMetaDto;", "e", "()Lcom/yandex/music/shared/slides/ui/music/logic/impl/network/model/SlideMetaDto;", "shared-slides-ui-music-logic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final /* data */ class SlideDto {

    @SerializedName(alternate = {"backgroundDto"}, value = C0479n3.g)
    private final SlideBackgroundDto background;

    @SerializedName("button")
    private final SlideButtonDto button;

    @SerializedName("content")
    private final SlideContentDto content;

    @SerializedName(ConnectableDevice.KEY_ID)
    private final String id;

    @SerializedName("meta")
    private final SlideMetaDto meta;

    @SerializedName("promoLogo")
    private final String promoLogo;

    @SerializedName("trailer")
    private final SlideTrailerDto trailer;

    public SlideDto(String str, SlideBackgroundDto slideBackgroundDto, String str2, SlideButtonDto slideButtonDto, SlideContentDto slideContentDto, SlideTrailerDto slideTrailerDto, SlideMetaDto slideMetaDto) {
        this.id = str;
        this.background = slideBackgroundDto;
        this.promoLogo = str2;
        this.button = slideButtonDto;
        this.content = slideContentDto;
        this.trailer = slideTrailerDto;
        this.meta = slideMetaDto;
    }

    /* renamed from: a, reason: from getter */
    public final SlideBackgroundDto getBackground() {
        return this.background;
    }

    /* renamed from: b, reason: from getter */
    public final SlideButtonDto getButton() {
        return this.button;
    }

    /* renamed from: c, reason: from getter */
    public final SlideContentDto getContent() {
        return this.content;
    }

    /* renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: e, reason: from getter */
    public final SlideMetaDto getMeta() {
        return this.meta;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlideDto)) {
            return false;
        }
        SlideDto slideDto = (SlideDto) obj;
        return Intrinsics.d(this.id, slideDto.id) && Intrinsics.d(this.background, slideDto.background) && Intrinsics.d(this.promoLogo, slideDto.promoLogo) && Intrinsics.d(this.button, slideDto.button) && Intrinsics.d(this.content, slideDto.content) && Intrinsics.d(this.trailer, slideDto.trailer) && Intrinsics.d(this.meta, slideDto.meta);
    }

    /* renamed from: f, reason: from getter */
    public final String getPromoLogo() {
        return this.promoLogo;
    }

    /* renamed from: g, reason: from getter */
    public final SlideTrailerDto getTrailer() {
        return this.trailer;
    }

    public final int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        SlideBackgroundDto slideBackgroundDto = this.background;
        int hashCode2 = (hashCode + (slideBackgroundDto == null ? 0 : slideBackgroundDto.hashCode())) * 31;
        String str2 = this.promoLogo;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        SlideButtonDto slideButtonDto = this.button;
        int hashCode4 = (hashCode3 + (slideButtonDto == null ? 0 : slideButtonDto.hashCode())) * 31;
        SlideContentDto slideContentDto = this.content;
        int hashCode5 = (hashCode4 + (slideContentDto == null ? 0 : slideContentDto.hashCode())) * 31;
        SlideTrailerDto slideTrailerDto = this.trailer;
        int hashCode6 = (hashCode5 + (slideTrailerDto == null ? 0 : slideTrailerDto.hashCode())) * 31;
        SlideMetaDto slideMetaDto = this.meta;
        return hashCode6 + (slideMetaDto != null ? slideMetaDto.hashCode() : 0);
    }

    public final String toString() {
        return "SlideDto(id=" + this.id + ", background=" + this.background + ", promoLogo=" + this.promoLogo + ", button=" + this.button + ", content=" + this.content + ", trailer=" + this.trailer + ", meta=" + this.meta + ")";
    }
}
