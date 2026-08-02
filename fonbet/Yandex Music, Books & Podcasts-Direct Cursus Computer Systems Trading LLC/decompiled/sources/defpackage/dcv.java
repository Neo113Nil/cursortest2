package defpackage;

import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes5.dex */
public enum dcv extends WebPath$Storage {
    @Override // ru.yandex.music.data.stores.WebPath$Storage
    public final String pathForSize(String str, int i) {
        return "https://" + str.replace("%%", i < 600 ? "mobile-small" : "mobile-regular");
    }
}
