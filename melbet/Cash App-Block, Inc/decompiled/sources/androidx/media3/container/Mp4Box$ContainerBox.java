package androidx.media3.container;

import androidx.media3.decoder.Buffer;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class Mp4Box$ContainerBox extends Buffer {
    public final ArrayList containerChildren;
    public final long endPosition;
    public final ArrayList leafChildren;

    public Mp4Box$ContainerBox(int i, long j) {
        super(i);
        this.endPosition = j;
        this.leafChildren = new ArrayList();
        this.containerChildren = new ArrayList();
    }

    public final Mp4Box$ContainerBox getContainerBoxOfType(int i) {
        ArrayList arrayList = this.containerChildren;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Mp4Box$ContainerBox mp4Box$ContainerBox = (Mp4Box$ContainerBox) arrayList.get(i2);
            if (mp4Box$ContainerBox.flags == i) {
                return mp4Box$ContainerBox;
            }
        }
        return null;
    }

    public final Mp4Box$LeafBox getLeafBoxOfType(int i) {
        ArrayList arrayList = this.leafChildren;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            Mp4Box$LeafBox mp4Box$LeafBox = (Mp4Box$LeafBox) arrayList.get(i2);
            if (mp4Box$LeafBox.flags == i) {
                return mp4Box$LeafBox;
            }
        }
        return null;
    }

    @Override // androidx.media3.decoder.Buffer
    public final String toString() {
        return Buffer.getBoxTypeString(this.flags) + " leaves: " + Arrays.toString(this.leafChildren.toArray()) + " containers: " + Arrays.toString(this.containerChildren.toArray());
    }
}
