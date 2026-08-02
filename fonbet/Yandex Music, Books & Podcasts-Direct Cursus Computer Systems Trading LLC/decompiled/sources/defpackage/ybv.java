package defpackage;

import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes5.dex */
public enum ybv extends WebPath$Storage {
    @Override // ru.yandex.music.data.stores.WebPath$Storage
    public final String pathForSize(String str, int i) {
        return str.replaceFirst("(\\d+x\\d+)|(%%)", "b".concat("200x200"));
    }
}
