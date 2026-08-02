package ru.yandex.video.m3.player.impl.trackselection;

import android.content.Context;
import android.graphics.Point;
import defpackage.ny61;
import defpackage.tw21;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.video.m3.data.Size;
import ru.yandex.video.m3.data.SizeKt;
import ru.yandex.video.m3.data.TargetFormat;
import ru.yandex.video.m3.player.mesure.TargetFormatProvider;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0002\f\rB\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/yandex/video/m3/player/impl/trackselection/DisplaySizeTargetFormatProvider;", "Lru/yandex/video/m3/player/mesure/TargetFormatProvider;", "displaySize", "Lru/yandex/video/m3/data/Size;", "availableFormatsJsonString", "", "forceDegradationStep", "", "(Lru/yandex/video/m3/data/Size;Ljava/lang/String;I)V", "targetFormatValue", "Lru/yandex/video/m3/data/TargetFormat;", "getTargetFormat", "Builder", "Companion", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DisplaySizeTargetFormatProvider implements TargetFormatProvider {
    public static final int $stable = 0;
    private static final String TAG_HEIGHT = "h";
    private static final String TAG_WIDTH = "w";
    private final TargetFormat targetFormatValue;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\bR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lru/yandex/video/m3/player/impl/trackselection/DisplaySizeTargetFormatProvider$Builder;", "", "()V", "availableFormatsJsonString", "", "context", "Landroid/content/Context;", "forceDegradationStep", "", "jsonString", "build", "Lru/yandex/video/m3/player/impl/trackselection/DisplaySizeTargetFormatProvider;", "steps", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        public static final int $stable = 8;
        private String availableFormatsJsonString;
        private Context context;
        private int forceDegradationStep;

        public final Builder availableFormatsJsonString(String jsonString) {
            this.availableFormatsJsonString = jsonString;
            return this;
        }

        public final DisplaySizeTargetFormatProvider build() {
            Context context = this.context;
            if (context == null || this.availableFormatsJsonString == null) {
                ny61.g("context and availableFormatsJsonString are mandatory parameters");
                return null;
            }
            if (this.forceDegradationStep >= 0) {
                Point z = tw21.z(context);
                return new DisplaySizeTargetFormatProvider(SizeKt.Size$default(z.x, z.y, null, 4, null), this.availableFormatsJsonString, this.forceDegradationStep);
            }
            ny61.g("forceDegradationStep must be positive or zero");
            return null;
        }

        public final Builder context(Context context) {
            this.context = context;
            return this;
        }

        public final Builder forceDegradationStep(int steps) {
            this.forceDegradationStep = steps;
            return this;
        }
    }

    public DisplaySizeTargetFormatProvider(Size size, String str, int i) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            if (jSONArray.length() == 0) {
                ny61.g("Empty JSON list in availableFormatsJsonString");
                throw null;
            }
            TreeMap treeMap = new TreeMap();
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i2);
                int optInt = jSONObject.optInt(TAG_WIDTH, -1);
                int optInt2 = jSONObject.optInt(TAG_HEIGHT, -1);
                if (optInt <= 0 || optInt2 <= 0 || optInt >= optInt2) {
                    ny61.g("Invalid format description in availableFormatsJsonString");
                    throw null;
                }
                TreeSet treeSet = (TreeSet) treeMap.get(Integer.valueOf(optInt));
                if (treeSet == null) {
                    treeSet = new TreeSet();
                    treeMap.put(Integer.valueOf(optInt), treeSet);
                }
                if (!treeSet.add(Integer.valueOf(optInt2))) {
                    ny61.g("Duplicated format description in availableFormatsJsonString");
                    throw null;
                }
            }
            Size Size$default = size.getWidth() > size.getHeight() ? SizeKt.Size$default(size.getHeight(), size.getWidth(), null, 4, null) : SizeKt.Size$default(size.getWidth(), size.getHeight(), null, 4, null);
            Size size2 = null;
            Size size3 = null;
            for (Integer num : treeMap.descendingKeySet()) {
                for (Integer num2 : ((TreeSet) treeMap.get(num)).descendingSet()) {
                    Size Size$default2 = SizeKt.Size$default(num.intValue(), num2.intValue(), null, 4, null);
                    if (num.intValue() <= Size$default.getWidth() && num2.intValue() <= Size$default.getHeight()) {
                        size2 = i >= 0 ? SizeKt.Size$default(num.intValue(), num2.intValue(), null, 4, null) : size2;
                        i--;
                    }
                    size3 = Size$default2;
                }
            }
            size2 = size2 == null ? size3 : size2;
            this.targetFormatValue = new TargetFormat(size2, size2);
        } catch (JSONException unused) {
            ny61.g("Invalid JSON list in availableFormatsJsonString");
            throw null;
        }
    }

    @Override // ru.yandex.video.m3.player.mesure.TargetFormatProvider
    /* renamed from: getTargetFormat, reason: from getter */
    public TargetFormat getTargetFormatValue() {
        return this.targetFormatValue;
    }
}
