package ru.yandextaxi.flutter_yandex_mapkit.styles.models;

import android.content.Context;
import com.yandex.mapkit.styling.transportnavigation.DrawableUtils;
import com.yandex.runtime.image.ImageProvider;
import com.yandex.runtime.model.ModelProvider;
import defpackage.der;
import defpackage.g8e;
import defpackage.gym;
import defpackage.i4b0;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.lbb0;
import defpackage.psr;
import defpackage.ssr;
import defpackage.tls;
import defpackage.unr0;
import defpackage.w511;
import defpackage.wbm;
import defpackage.wls;
import defpackage.ysq0;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/styles/models/PlacemarkStyleData;", "", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/PlacemarkStyleData$PlacemarkStyle;", "day", "night", "<init>", "(Lru/yandextaxi/flutter_yandex_mapkit/styles/models/PlacemarkStyleData$PlacemarkStyle;Lru/yandextaxi/flutter_yandex_mapkit/styles/models/PlacemarkStyleData$PlacemarkStyle;)V", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/PlacemarkStyleData$PlacemarkStyle;", "getDay", "()Lru/yandextaxi/flutter_yandex_mapkit/styles/models/PlacemarkStyleData$PlacemarkStyle;", "getNight", "ContentType", "PlacemarkStyle", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PlacemarkStyleData {

    @ysq0("day")
    private final PlacemarkStyle day;

    @ysq0("night")
    private final PlacemarkStyle night;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/styles/models/PlacemarkStyleData$ContentType;", "", "<init>", "(Ljava/lang/String;I)V", "MODEL", "IMG", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ContentType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ContentType[] $VALUES;

        @ysq0("img")
        public static final ContentType IMG;

        @ysq0("model")
        public static final ContentType MODEL;

        static {
            ContentType contentType = new ContentType("MODEL", 0);
            MODEL = contentType;
            ContentType contentType2 = new ContentType("IMG", 1);
            IMG = contentType2;
            ContentType[] contentTypeArr = {contentType, contentType2};
            $VALUES = contentTypeArr;
            $ENTRIES = kotlin.enums.a.a(contentTypeArr);
        }

        private ContentType(String str, int i) {
        }

        public static ContentType valueOf(String str) {
            return (ContentType) Enum.valueOf(ContentType.class, str);
        }

        public static ContentType[] values() {
            return (ContentType[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\u001a\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Lru/yandextaxi/flutter_yandex_mapkit/styles/models/PlacemarkStyleData$PlacemarkStyle;", "", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/PlacemarkStyleData$ContentType;", "contentType", "", "texturePath", "modelPath", "", "modelScale", "imgPath", "imgScale", "<init>", "(Lru/yandextaxi/flutter_yandex_mapkit/styles/models/PlacemarkStyleData$ContentType;Ljava/lang/String;Ljava/lang/String;FLjava/lang/String;F)V", "Lru/yandextaxi/flutter_yandex_mapkit/styles/models/PlacemarkStyleData$ContentType;", "getContentType", "()Lru/yandextaxi/flutter_yandex_mapkit/styles/models/PlacemarkStyleData$ContentType;", "Ljava/lang/String;", "getTexturePath", "()Ljava/lang/String;", "getModelPath", "F", "getModelScale", "()F", "getImgPath", "getImgScale", "flutter_yandex_mapkit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlacemarkStyle {

        @ysq0("contentType")
        private final ContentType contentType;

        @ysq0("imgPath")
        private final String imgPath;

        @ysq0("imgScale")
        private final float imgScale;

        @ysq0("modelPath")
        private final String modelPath;

        @ysq0("modelScale")
        private final float modelScale;

        @ysq0("texturePath")
        private final String texturePath;

        public PlacemarkStyle(ContentType contentType, String str, String str2, float f, String str3, float f2) {
            this.contentType = contentType;
            this.texturePath = str;
            this.modelPath = str2;
            this.modelScale = f;
            this.imgPath = str3;
            this.imgScale = f2;
        }

        public final void a(ssr ssrVar, float f, wls wlsVar, tls tlsVar) {
            int i = a.a[this.contentType.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    w511.b();
                    return;
                } else {
                    tlsVar.invoke(new wbm(this.imgPath, this.imgScale * f, ssrVar, DrawableUtils.INSTANCE));
                    return;
                }
            }
            gym gymVar = ssrVar.f;
            String c = ((psr) gymVar.a).c(this.texturePath);
            Context context = ssrVar.a;
            ImageProvider fromAsset = ImageProvider.fromAsset(context, c);
            gym gymVar2 = ssrVar.f;
            wlsVar.invoke(new der(ModelProvider.fromAsset(context, ((psr) gymVar2.a).c(this.modelPath), fromAsset)), Float.valueOf(this.modelScale * 75.0f));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PlacemarkStyle)) {
                return false;
            }
            PlacemarkStyle placemarkStyle = (PlacemarkStyle) obj;
            return this.contentType == placemarkStyle.contentType && jl40.l(this.texturePath, placemarkStyle.texturePath) && jl40.l(this.modelPath, placemarkStyle.modelPath) && Float.compare(this.modelScale, placemarkStyle.modelScale) == 0 && jl40.l(this.imgPath, placemarkStyle.imgPath) && Float.compare(this.imgScale, placemarkStyle.imgScale) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.imgScale) + unr0.b(g8e.c(this.modelScale, unr0.b(unr0.b(this.contentType.hashCode() * 31, 31, this.texturePath), 31, this.modelPath), 31), 31, this.imgPath);
        }

        public final String toString() {
            return "PlacemarkStyle(contentType=" + this.contentType + ", texturePath=" + this.texturePath + ", modelPath=" + this.modelPath + ", modelScale=" + this.modelScale + ", imgPath=" + this.imgPath + ", imgScale=" + this.imgScale + Extension.C_BRAKE;
        }
    }

    public PlacemarkStyleData(PlacemarkStyle placemarkStyle, PlacemarkStyle placemarkStyle2) {
        this.day = placemarkStyle;
        this.night = placemarkStyle2;
    }

    public final void a(ssr ssrVar, float f, boolean z, com.yandex.mapkit.styling.PlacemarkStyle placemarkStyle) {
        PlacemarkStyle placemarkStyle2 = z ? this.night : this.day;
        placemarkStyle2.getClass();
        placemarkStyle2.a(ssrVar, f, new lbb0(3, placemarkStyle), new i4b0(16, placemarkStyle));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlacemarkStyleData)) {
            return false;
        }
        PlacemarkStyleData placemarkStyleData = (PlacemarkStyleData) obj;
        return jl40.l(this.day, placemarkStyleData.day) && jl40.l(this.night, placemarkStyleData.night);
    }

    public final int hashCode() {
        return this.night.hashCode() + (this.day.hashCode() * 31);
    }

    public final String toString() {
        return "PlacemarkStyleData(day=" + this.day + ", night=" + this.night + Extension.C_BRAKE;
    }
}
