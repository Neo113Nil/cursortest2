package com.yandex.music.shared.bdui.core.impl;

import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.yandex.music.shared.backend_utils.MusicBackendResponse;
import defpackage.dak;
import defpackage.kpt;
import defpackage.lzc;
import defpackage.v2j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Call;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001:\u0002\u000b\fJ%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0001\u0010\t\u001a\u00020\u0002H'¢\u0006\u0004\b\n\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/yandex/music/shared/bdui/core/impl/BduiApi;", "", "", ConnectableDevice.KEY_ID, "Lretrofit2/Call;", "Lcom/yandex/music/shared/backend_utils/MusicBackendResponse;", "Lcom/yandex/music/shared/bdui/core/impl/BduiApi$BduiScreenDto;", "b", "(Ljava/lang/String;)Lretrofit2/Call;", "url", "a", "BduiScreenDto", "DivDto", "shared-bdui-core"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public interface BduiApi {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/music/shared/bdui/core/impl/BduiApi$BduiScreenDto;", "", "", "layout", "Lcom/yandex/music/shared/bdui/core/impl/BduiApi$DivDto;", "div", "<init>", "(Ljava/lang/String;Lcom/yandex/music/shared/bdui/core/impl/BduiApi$DivDto;)V", "Ljava/lang/String;", "getLayout", "()Ljava/lang/String;", "Lcom/yandex/music/shared/bdui/core/impl/BduiApi$DivDto;", "a", "()Lcom/yandex/music/shared/bdui/core/impl/BduiApi$DivDto;", "shared-bdui-core"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final /* data */ class BduiScreenDto {

        @SerializedName("div")
        private final DivDto div;

        @SerializedName("layout")
        private final String layout;

        public BduiScreenDto(String str, DivDto divDto) {
            this.layout = str;
            this.div = divDto;
        }

        /* renamed from: a, reason: from getter */
        public final DivDto getDiv() {
            return this.div;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BduiScreenDto)) {
                return false;
            }
            BduiScreenDto bduiScreenDto = (BduiScreenDto) obj;
            return Intrinsics.d(this.layout, bduiScreenDto.layout) && Intrinsics.d(this.div, bduiScreenDto.div);
        }

        public final int hashCode() {
            String str = this.layout;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            DivDto divDto = this.div;
            return hashCode + (divDto != null ? divDto.hashCode() : 0);
        }

        public final String toString() {
            return "BduiScreenDto(layout=" + this.layout + ", div=" + this.div + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/yandex/music/shared/bdui/core/impl/BduiApi$DivDto;", "", "Lcom/google/gson/JsonObject;", "templates", "card", "<init>", "(Lcom/google/gson/JsonObject;Lcom/google/gson/JsonObject;)V", "Lcom/google/gson/JsonObject;", "b", "()Lcom/google/gson/JsonObject;", "a", "shared-bdui-core"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
    public static final /* data */ class DivDto {

        @SerializedName("card")
        private final JsonObject card;

        @SerializedName("templates")
        private final JsonObject templates;

        public DivDto(JsonObject jsonObject, JsonObject jsonObject2) {
            this.templates = jsonObject;
            this.card = jsonObject2;
        }

        /* renamed from: a, reason: from getter */
        public final JsonObject getCard() {
            return this.card;
        }

        /* renamed from: b, reason: from getter */
        public final JsonObject getTemplates() {
            return this.templates;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DivDto)) {
                return false;
            }
            DivDto divDto = (DivDto) obj;
            return Intrinsics.d(this.templates, divDto.templates) && Intrinsics.d(this.card, divDto.card);
        }

        public final int hashCode() {
            JsonObject jsonObject = this.templates;
            int hashCode = (jsonObject == null ? 0 : jsonObject.a.hashCode()) * 31;
            JsonObject jsonObject2 = this.card;
            return hashCode + (jsonObject2 != null ? jsonObject2.a.hashCode() : 0);
        }

        public final String toString() {
            return "DivDto(templates=" + this.templates + ", card=" + this.card + ")";
        }
    }

    @v2j
    @lzc
    @NotNull
    Call<MusicBackendResponse<BduiScreenDto>> a(@kpt @NotNull String url);

    @v2j
    @lzc("dynamic-pages/div-screens/{screenId}")
    @NotNull
    Call<MusicBackendResponse<BduiScreenDto>> b(@dak("screenId") @NotNull String id);
}
