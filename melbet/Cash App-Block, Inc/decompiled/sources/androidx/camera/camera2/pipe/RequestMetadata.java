package androidx.camera.camera2.pipe;

import java.util.Map;

/* loaded from: classes3.dex */
public interface RequestMetadata extends Metadata, UnsafeWrapper {
    boolean getRepeating();

    Request getRequest();

    /* renamed from: getRequestNumber-my6kx4g */
    long mo32getRequestNumbermy6kx4g();

    Map getStreams();
}
