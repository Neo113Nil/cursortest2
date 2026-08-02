package ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formasynctask;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0015\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/yandex/taxi/logistics/sdk/dto/services/deliverygocheckout/definitions/formasynctask/AsyncTaskInfoDialogDto;", "", "id", "", "imageTag", "title", Constants.KEY_MESSAGE, "buttonText", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getImageTag", "getTitle", "getMessage", "getButtonText", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "android-delivery-dto"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class AsyncTaskInfoDialogDto {
    private final String buttonText;
    private final String id;
    private final String imageTag;
    private final String message;
    private final String title;

    public AsyncTaskInfoDialogDto(@Json(name = "id") String str, @Json(name = "image_tag") String str2, @Json(name = "title") String str3, @Json(name = "message") String str4, @Json(name = "button_text") String str5) {
        this.id = str;
        this.imageTag = str2;
        this.title = str3;
        this.message = str4;
        this.buttonText = str5;
    }

    public static /* synthetic */ AsyncTaskInfoDialogDto copy$default(AsyncTaskInfoDialogDto asyncTaskInfoDialogDto, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = asyncTaskInfoDialogDto.id;
        }
        if ((i & 2) != 0) {
            str2 = asyncTaskInfoDialogDto.imageTag;
        }
        if ((i & 4) != 0) {
            str3 = asyncTaskInfoDialogDto.title;
        }
        if ((i & 8) != 0) {
            str4 = asyncTaskInfoDialogDto.message;
        }
        if ((i & 16) != 0) {
            str5 = asyncTaskInfoDialogDto.buttonText;
        }
        String str6 = str5;
        String str7 = str3;
        return asyncTaskInfoDialogDto.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getImageTag() {
        return this.imageTag;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component5, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    public final AsyncTaskInfoDialogDto copy(@Json(name = "id") String id, @Json(name = "image_tag") String imageTag, @Json(name = "title") String title, @Json(name = "message") String message, @Json(name = "button_text") String buttonText) {
        return new AsyncTaskInfoDialogDto(id, imageTag, title, message, buttonText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AsyncTaskInfoDialogDto)) {
            return false;
        }
        AsyncTaskInfoDialogDto asyncTaskInfoDialogDto = (AsyncTaskInfoDialogDto) other;
        return jl40.l(this.id, asyncTaskInfoDialogDto.id) && jl40.l(this.imageTag, asyncTaskInfoDialogDto.imageTag) && jl40.l(this.title, asyncTaskInfoDialogDto.title) && jl40.l(this.message, asyncTaskInfoDialogDto.message) && jl40.l(this.buttonText, asyncTaskInfoDialogDto.buttonText);
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageTag() {
        return this.imageTag;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.imageTag;
        int b = unr0.b((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.title);
        String str3 = this.message;
        int hashCode2 = (b + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.buttonText;
        return hashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.imageTag;
        String str3 = this.title;
        String str4 = this.message;
        String str5 = this.buttonText;
        StringBuilder v = b64.v("AsyncTaskInfoDialogDto(id=", str, ", imageTag=", str2, ", title=");
        g8e.D(v, str3, ", message=", str4, ", buttonText=");
        return oyr.t(v, str5, Extension.C_BRAKE);
    }
}
