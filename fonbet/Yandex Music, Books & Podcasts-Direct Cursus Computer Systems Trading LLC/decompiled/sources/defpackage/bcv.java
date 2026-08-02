package defpackage;

import ru.yandex.music.data.stores.WebPath$Storage;

/* loaded from: classes5.dex */
public enum bcv extends WebPath$Storage {
    @Override // ru.yandex.music.data.stores.WebPath$Storage
    public final String pathForSize(String str, int i) {
        String avatarsSizeString;
        StringBuilder sb = new StringBuilder("m");
        avatarsSizeString = WebPath$Storage.avatarsSizeString(i);
        sb.append(avatarsSizeString);
        return str.replace("%%", sb.toString());
    }
}
