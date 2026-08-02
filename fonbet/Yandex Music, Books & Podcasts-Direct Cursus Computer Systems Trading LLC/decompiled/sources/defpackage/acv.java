package defpackage;

import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes5.dex */
public enum acv extends WebPath$Storage {
    @Override // ru.yandex.music.data.stores.WebPath$Storage
    public final String pathForSize(String str, int i) {
        String avatarsSizeString;
        avatarsSizeString = WebPath$Storage.avatarsSizeString(i);
        return str.replace("%%", avatarsSizeString);
    }
}
