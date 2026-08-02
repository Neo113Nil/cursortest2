package ru.yandex.music.data.stores;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import defpackage.acv;
import defpackage.bcv;
import defpackage.ccv;
import defpackage.dcv;
import defpackage.ecv;
import defpackage.fcv;
import defpackage.gcv;
import defpackage.hcv;
import defpackage.icv;
import defpackage.wbv;
import defpackage.xbv;
import defpackage.ybv;
import defpackage.zbv;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
/* loaded from: classes5.dex */
public abstract class WebPath$Storage {
    public static final WebPath$Storage AVATARS = new acv("AVATARS", 0);
    public static final WebPath$Storage AVATARS_NO_CROP = new bcv("AVATARS_NO_CROP", 1);
    public static final WebPath$Storage AVATARS_69 = new ccv("AVATARS_69", 2);
    public static final WebPath$Storage MOBILE = new dcv("MOBILE", 3);
    public static final WebPath$Storage MOBILE_SPECIAL = new ecv("MOBILE_SPECIAL", 4);
    public static final WebPath$Storage AFISHA = new fcv("AFISHA", 5);
    public static final WebPath$Storage OPERATORS = new gcv("OPERATORS", 6);
    public static final WebPath$Storage VIDEOS = new hcv("VIDEOS", 7);
    public static final WebPath$Storage ENTITY_BACKGROUND_IMG = new icv("ENTITY_BACKGROUND_IMG", 8);
    public static final WebPath$Storage DEFAULT_LIBRARY = new wbv("DEFAULT_LIBRARY", 9);
    public static final WebPath$Storage VIDEO_CLIP = new xbv("VIDEO_CLIP", 10);
    public static final WebPath$Storage BACKGROUND_BLUR = new ybv("BACKGROUND_BLUR", 11);
    public static final WebPath$Storage SPECIAL_BLOCK_IMAGE = new zbv("SPECIAL_BLOCK_IMAGE", 12);
    private static final /* synthetic */ WebPath$Storage[] $VALUES = $values();

    private static /* synthetic */ WebPath$Storage[] $values() {
        return new WebPath$Storage[]{AVATARS, AVATARS_NO_CROP, AVATARS_69, MOBILE, MOBILE_SPECIAL, AFISHA, OPERATORS, VIDEOS, ENTITY_BACKGROUND_IMG, DEFAULT_LIBRARY, VIDEO_CLIP, BACKGROUND_BLUR, SPECIAL_BLOCK_IMAGE};
    }

    private WebPath$Storage(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public static String avatarsSizeString(int i) {
        return i <= 30 ? "30x30" : i <= 50 ? "50x50" : i <= 80 ? "80x80" : i <= 100 ? "100x100" : i <= 200 ? "200x200" : i <= 300 ? "300x300" : i <= 460 ? "460x460" : i <= 700 ? "700x700" : "1000x1000";
    }

    public static WebPath$Storage valueOf(String str) {
        return (WebPath$Storage) Enum.valueOf(WebPath$Storage.class, str);
    }

    public static WebPath$Storage[] values() {
        return (WebPath$Storage[]) $VALUES.clone();
    }

    @NonNull
    public abstract String pathForSize(@NonNull String str, int i);
}
