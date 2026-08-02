package defpackage;

import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes5.dex */
public enum gcv extends WebPath$Storage {
    @Override // ru.yandex.music.data.stores.WebPath$Storage
    public final String pathForSize(String str, int i) {
        return str.replace("%%", i <= 400 ? "256x24" : i <= 650 ? "512x48" : i <= 1000 ? "768x72" : "1280x120");
    }
}
