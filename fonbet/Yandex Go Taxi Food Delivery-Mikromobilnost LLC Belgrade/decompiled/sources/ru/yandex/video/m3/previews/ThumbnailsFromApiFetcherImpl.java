package ru.yandex.video.m3.previews;

import com.yandex.div.state.db.StateEntry;
import defpackage.b64;
import defpackage.d5j0;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.jwu;
import defpackage.kbs;
import defpackage.kwu;
import defpackage.nci0;
import defpackage.oyr;
import defpackage.rvj0;
import defpackage.t4j0;
import defpackage.tls;
import defpackage.unr0;
import defpackage.ysq0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.player.utils.JsonConverter;
import ru.yandex.video.m3.previews.RawThumbnail;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011¨\u0006\u0014"}, d2 = {"Lru/yandex/video/m3/previews/ThumbnailsFromApiFetcherImpl;", "Lru/yandex/video/m3/previews/ThumbnailsFromApiFetcher;", "Lokhttp3/OkHttpClient;", "okHttpClient", "Lru/yandex/video/m3/player/utils/JsonConverter;", "jsonConverter", "<init>", "(Lokhttp3/OkHttpClient;Lru/yandex/video/m3/player/utils/JsonConverter;)V", "Lkwu;", "url", "", "presentationTimeOffsetMs", "", "Lru/yandex/video/m3/previews/RawThumbnail;", "fetch", "(Lkwu;J)Ljava/util/List;", "Lokhttp3/OkHttpClient;", "Lru/yandex/video/m3/player/utils/JsonConverter;", "RawJsonThumbnail", "RawJsonThumbnails", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ThumbnailsFromApiFetcherImpl implements ThumbnailsFromApiFetcher {
    public static final int $stable = 8;
    private final JsonConverter jsonConverter;
    private final OkHttpClient okHttpClient;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0083\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JO\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u0005HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010¨\u0006$"}, d2 = {"Lru/yandex/video/m3/previews/ThumbnailsFromApiFetcherImpl$RawJsonThumbnail;", "", "label", "", "tilesWidth", "", "tilesHeight", "duration", "", "width", "height", StateEntry.COLUMN_PATH, "(Ljava/lang/String;IIFIILjava/lang/String;)V", "getDuration", "()F", "getHeight", "()I", "getLabel", "()Ljava/lang/String;", "getPath", "getTilesHeight", "getTilesWidth", "getWidth", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class RawJsonThumbnail {
        private final float duration;
        private final int height;
        private final String label;
        private final String path;

        @ysq0("tiles_height")
        private final int tilesHeight;

        @ysq0("tiles_width")
        private final int tilesWidth;
        private final int width;

        public RawJsonThumbnail(String str, int i, int i2, float f, int i3, int i4, String str2) {
            this.label = str;
            this.tilesWidth = i;
            this.tilesHeight = i2;
            this.duration = f;
            this.width = i3;
            this.height = i4;
            this.path = str2;
        }

        public static /* synthetic */ RawJsonThumbnail copy$default(RawJsonThumbnail rawJsonThumbnail, String str, int i, int i2, float f, int i3, int i4, String str2, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                str = rawJsonThumbnail.label;
            }
            if ((i5 & 2) != 0) {
                i = rawJsonThumbnail.tilesWidth;
            }
            if ((i5 & 4) != 0) {
                i2 = rawJsonThumbnail.tilesHeight;
            }
            if ((i5 & 8) != 0) {
                f = rawJsonThumbnail.duration;
            }
            if ((i5 & 16) != 0) {
                i3 = rawJsonThumbnail.width;
            }
            if ((i5 & 32) != 0) {
                i4 = rawJsonThumbnail.height;
            }
            if ((i5 & 64) != 0) {
                str2 = rawJsonThumbnail.path;
            }
            int i6 = i4;
            String str3 = str2;
            int i7 = i3;
            int i8 = i2;
            return rawJsonThumbnail.copy(str, i, i8, f, i7, i6, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: component2, reason: from getter */
        public final int getTilesWidth() {
            return this.tilesWidth;
        }

        /* renamed from: component3, reason: from getter */
        public final int getTilesHeight() {
            return this.tilesHeight;
        }

        /* renamed from: component4, reason: from getter */
        public final float getDuration() {
            return this.duration;
        }

        /* renamed from: component5, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* renamed from: component6, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        /* renamed from: component7, reason: from getter */
        public final String getPath() {
            return this.path;
        }

        public final RawJsonThumbnail copy(String label, int tilesWidth, int tilesHeight, float duration, int width, int height, String path) {
            return new RawJsonThumbnail(label, tilesWidth, tilesHeight, duration, width, height, path);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RawJsonThumbnail)) {
                return false;
            }
            RawJsonThumbnail rawJsonThumbnail = (RawJsonThumbnail) other;
            return jl40.l(this.label, rawJsonThumbnail.label) && this.tilesWidth == rawJsonThumbnail.tilesWidth && this.tilesHeight == rawJsonThumbnail.tilesHeight && Float.compare(this.duration, rawJsonThumbnail.duration) == 0 && this.width == rawJsonThumbnail.width && this.height == rawJsonThumbnail.height && jl40.l(this.path, rawJsonThumbnail.path);
        }

        public final float getDuration() {
            return this.duration;
        }

        public final int getHeight() {
            return this.height;
        }

        public final String getLabel() {
            return this.label;
        }

        public final String getPath() {
            return this.path;
        }

        public final int getTilesHeight() {
            return this.tilesHeight;
        }

        public final int getTilesWidth() {
            return this.tilesWidth;
        }

        public final int getWidth() {
            return this.width;
        }

        public int hashCode() {
            return this.path.hashCode() + oyr.b(this.height, oyr.b(this.width, g8e.c(this.duration, oyr.b(this.tilesHeight, oyr.b(this.tilesWidth, this.label.hashCode() * 31, 31), 31), 31), 31), 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("RawJsonThumbnail(label=");
            sb.append(this.label);
            sb.append(", tilesWidth=");
            sb.append(this.tilesWidth);
            sb.append(", tilesHeight=");
            sb.append(this.tilesHeight);
            sb.append(", duration=");
            sb.append(this.duration);
            sb.append(", width=");
            sb.append(this.width);
            sb.append(", height=");
            sb.append(this.height);
            sb.append(", path=");
            return b64.p(sb, this.path, ')');
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lru/yandex/video/m3/previews/ThumbnailsFromApiFetcherImpl$RawJsonThumbnails;", "", "thumbnails", "", "Lru/yandex/video/m3/previews/ThumbnailsFromApiFetcherImpl$RawJsonThumbnail;", "(Ljava/util/List;)V", "getThumbnails", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class RawJsonThumbnails {

        @ysq0("thumbnails")
        private final List<RawJsonThumbnail> thumbnails;

        public RawJsonThumbnails(List<RawJsonThumbnail> list) {
            this.thumbnails = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RawJsonThumbnails copy$default(RawJsonThumbnails rawJsonThumbnails, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = rawJsonThumbnails.thumbnails;
            }
            return rawJsonThumbnails.copy(list);
        }

        public final List<RawJsonThumbnail> component1() {
            return this.thumbnails;
        }

        public final RawJsonThumbnails copy(List<RawJsonThumbnail> thumbnails) {
            return new RawJsonThumbnails(thumbnails);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof RawJsonThumbnails) && jl40.l(this.thumbnails, ((RawJsonThumbnails) other).thumbnails);
        }

        public final List<RawJsonThumbnail> getThumbnails() {
            return this.thumbnails;
        }

        public int hashCode() {
            return this.thumbnails.hashCode();
        }

        public String toString() {
            return unr0.t(new StringBuilder("RawJsonThumbnails(thumbnails="), this.thumbnails, ')');
        }
    }

    public ThumbnailsFromApiFetcherImpl(OkHttpClient okHttpClient, JsonConverter jsonConverter) {
        this.okHttpClient = okHttpClient;
        this.jsonConverter = jsonConverter;
    }

    @Override // ru.yandex.video.m3.previews.ThumbnailsFromApiFetcher
    public List<RawThumbnail> fetch(kwu url, long presentationTimeOffsetMs) throws Exception {
        String string;
        RawThumbnail RawThumbnail;
        jwu g = url.g();
        g.d("json_preview", "1");
        kwu e = g.e();
        OkHttpClient okHttpClient = this.okHttpClient;
        t4j0 t4j0Var = new t4j0();
        t4j0Var.a = e;
        rvj0 rvj0Var = ((nci0) okHttpClient.newCall(new d5j0(t4j0Var))).execute().z;
        if (rvj0Var == null || (string = rvj0Var.string()) == null) {
            kbs.g("impossible to get thumbnails");
            return null;
        }
        RawJsonThumbnails rawJsonThumbnails = (RawJsonThumbnails) this.jsonConverter.from(string, RawJsonThumbnails.class);
        ArrayList arrayList = new ArrayList();
        for (RawJsonThumbnail rawJsonThumbnail : rawJsonThumbnails.getThumbnails()) {
            RawThumbnail = RawThumbnailKt.RawThumbnail(jl40.l(rawJsonThumbnail.getLabel(), "lowres") ? Type.LOW_RES : Type.HI_RES, rawJsonThumbnail.getTilesWidth(), rawJsonThumbnail.getTilesHeight(), rawJsonThumbnail.getDuration(), presentationTimeOffsetMs, new MaskPathProvider(rawJsonThumbnail.getPath()), PreviewVersion.V3, (r19 & 128) != 0 ? new tls() { // from class: ru.yandex.video.m3.previews.RawThumbnailKt$RawThumbnail$1
                @Override // defpackage.tls
                public /* bridge */ /* synthetic */ Object invoke(Object obj4) {
                    invoke((RawThumbnail.Builder) obj4);
                    return zy11.a;
                }

                public final void invoke(RawThumbnail.Builder builder) {
                }
            } : null);
            arrayList.add(RawThumbnail);
        }
        return arrayList;
    }
}
