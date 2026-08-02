package defpackage;

import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class jmn {
    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof jmn);
    }

    public final int hashCode() {
        return Integer.hashCode(R.string.recognition_retry_button) + f1d.a(R.string.recognition_error, f1d.a(R.string.recognition_connecting, Integer.hashCode(R.string.recognition_listening) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder l = dfi.l("RecognitionStringResources(listeningRes=", R.string.recognition_listening, R.string.recognition_connecting, ", connectingRes=", ", errorTextRes=");
        l.append(R.string.recognition_error);
        l.append(", retryButtonRes=");
        l.append(R.string.recognition_retry_button);
        l.append(")");
        return l.toString();
    }
}
