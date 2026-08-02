package defpackage;

import com.apollographql.apollo3.api.json.JsonReader$Token;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public interface xdx extends Closeable {
    void B0();

    hdx J0();

    ArrayList getPath();

    int h2(List list);

    boolean hasNext();

    xdx j();

    xdx l();

    boolean nextBoolean();

    double nextDouble();

    int nextInt();

    long nextLong();

    String nextName();

    String nextString();

    JsonReader$Token peek();

    void rewind();

    void skipValue();

    xdx u();

    xdx y();
}
