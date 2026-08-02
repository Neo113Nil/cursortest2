package androidx.media3.exoplayer.video.spherical;

import androidx.media3.common.util.TimedValueQueue;

/* loaded from: classes3.dex */
public final class Projection {
    public final Mesh leftMesh;
    public final Mesh rightMesh;
    public final boolean singleMesh;
    public final int stereoMode;

    public final class Mesh {
        public final TimedValueQueue[] subMeshes;

        public Mesh(TimedValueQueue... timedValueQueueArr) {
            this.subMeshes = timedValueQueueArr;
        }
    }

    public Projection(Mesh mesh, Mesh mesh2, int i) {
        this.leftMesh = mesh;
        this.rightMesh = mesh2;
        this.stereoMode = i;
        this.singleMesh = mesh == mesh2;
    }
}
