package androidx.credentials;

import android.media.MediaCodecInfo;
import android.os.Bundle;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScopeImpl;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasuredItem;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.composer.gapbuffer.GapAnchor;
import androidx.compose.runtime.composer.gapbuffer.GapGroupSourceInformation;
import androidx.compose.runtime.tooling.ComposeStackTraceFrame;
import androidx.compose.ui.layout.Measurable;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bumptech.glide.load.engine.bitmap_recycle.Poolable;
import com.bumptech.glide.load.model.ByteBufferEncoder;
import com.bumptech.glide.load.model.FileLoader;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.intellij.markdown.MarkdownParsingException;
import org.intellij.markdown.ast.ASTNodeImpl;
import org.intellij.markdown.lexer.Stack;
import org.intellij.markdown.parser.TreeBuilder$MyASTNodeWrapper;
import org.intellij.markdown.parser.TreeBuilder$MyEvent;
import org.intellij.markdown.parser.sequentialparsers.SequentialParser;

/* loaded from: classes3.dex */
public abstract class Credential implements ModelLoaderFactory {
    public Object data;

    public Credential(int i) {
        switch (i) {
            case 3:
                MutableIntObjectMap mutableIntObjectMap = IntObjectMapKt.EmptyIntObjectMap;
                this.data = new MutableIntObjectMap();
                break;
            case 4:
                this.data = new ArrayList();
                break;
            case 5:
            case 7:
            default:
                this.data = null;
                break;
            case 6:
                this.data = new ArrayDeque(20);
                break;
            case 8:
                this.data = new ReentrantReadWriteLock();
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003e, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean appendGroupSourceInformation(int i, GapGroupSourceInformation gapGroupSourceInformation, Object obj) {
        String obj2;
        ArrayList arrayList = gapGroupSourceInformation.groups;
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                Object obj3 = arrayList.get(i2);
                if (!(obj3 instanceof GapAnchor)) {
                    if (!(obj3 instanceof GapGroupSourceInformation)) {
                        obj2 = ("Unexpected child source info " + obj3).toString();
                        a$$ExternalSyntheticBUOutline0.m$1(obj2);
                        break;
                    }
                    if (appendGroupSourceInformation(i, (GapGroupSourceInformation) obj3, obj)) {
                        appendTraceFrame(0, gapGroupSourceInformation, obj3);
                        return true;
                    }
                } else if (obj3 == obj) {
                    appendTraceFrame(0, gapGroupSourceInformation, obj3);
                    return true;
                }
                i2++;
            }
        } else {
            appendTraceFrame(i, gapGroupSourceInformation, null);
            return true;
        }
    }

    public void appendTraceFrame(int i, GapGroupSourceInformation gapGroupSourceInformation, Object obj) {
        ((ArrayList) this.data).add(new ComposeStackTraceFrame(i, null, null));
    }

    @Override // com.bumptech.glide.load.model.ModelLoaderFactory
    public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory) {
        return new FileLoader((ByteBufferEncoder) this.data, 0);
    }

    public ASTNodeImpl buildTree(List list) {
        List list2;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            SequentialParser.Node node = (SequentialParser.Node) list.get(i2);
            IntRange intRange = node.range;
            int i3 = intRange.first;
            int i4 = intRange.last;
            arrayList.add(new TreeBuilder$MyEvent(i3, i2, node));
            if (i4 != i3) {
                arrayList.add(new TreeBuilder$MyEvent(i4, i2, node));
            }
        }
        CollectionsKt__MutableCollectionsJVMKt.sort(arrayList);
        Stack stack = new Stack();
        ArrayList arrayList2 = (ArrayList) stack.$$delegate_0;
        if (arrayList.isEmpty()) {
            throw new MarkdownParsingException("nonsense");
        }
        if (!((TreeBuilder$MyEvent) CollectionsKt.first((List) arrayList)).info.equals(((TreeBuilder$MyEvent) CollectionsKt.last((List) arrayList)).info)) {
            StringBuilder sb = new StringBuilder("more than one root?\nfirst: ");
            sb.append(((TreeBuilder$MyEvent) CollectionsKt.first((List) arrayList)).info);
            SequentialParser.Node node2 = ((TreeBuilder$MyEvent) CollectionsKt.last((List) arrayList)).info;
            sb.append("\nlast: ");
            sb.append(node2);
            throw new MarkdownParsingException(sb.toString());
        }
        int size2 = arrayList.size();
        while (true) {
            if (i >= size2) {
                a$$ExternalSyntheticBUOutline0.m$1((Object) "markers stack should close some time thus would not be here!");
                return null;
            }
            TreeBuilder$MyEvent treeBuilder$MyEvent = (TreeBuilder$MyEvent) arrayList.get(i);
            flushEverythingBeforeEvent(treeBuilder$MyEvent, arrayList2.isEmpty() ? null : (List) ((Pair) CollectionsKt.last((List) stack)).second);
            boolean isStart = treeBuilder$MyEvent.isStart();
            SequentialParser.Node node3 = treeBuilder$MyEvent.info;
            if (isStart) {
                stack.add(new Pair(treeBuilder$MyEvent, new ArrayList()));
            } else {
                IntRange intRange2 = node3.range;
                if (intRange2.first == intRange2.last) {
                    list2 = new ArrayList();
                } else {
                    Pair pair = (Pair) stack.pop();
                    if (!((TreeBuilder$MyEvent) pair.first).info.equals(node3)) {
                        throw new MarkdownParsingException("Intersecting parsed nodes detected: " + ((TreeBuilder$MyEvent) pair.first).info + " vs " + node3);
                    }
                    list2 = (List) pair.second;
                }
                boolean isEmpty = arrayList2.isEmpty();
                TreeBuilder$MyASTNodeWrapper createASTNodeOnClosingEvent = createASTNodeOnClosingEvent(treeBuilder$MyEvent, list2, isEmpty);
                if (isEmpty) {
                    if (i + 1 == arrayList.size()) {
                        return createASTNodeOnClosingEvent.astNode;
                    }
                    throw new MarkdownParsingException("");
                }
                ((List) ((Pair) CollectionsKt.last((List) stack)).second).add(createASTNodeOnClosingEvent);
            }
            i++;
        }
    }

    public abstract TreeBuilder$MyASTNodeWrapper createASTNodeOnClosingEvent(TreeBuilder$MyEvent treeBuilder$MyEvent, List list, boolean z);

    public abstract void flushEverythingBeforeEvent(TreeBuilder$MyEvent treeBuilder$MyEvent, List list);

    /* renamed from: getAndMeasure--hBUhpc */
    public abstract LazyLayoutMeasuredItem mo308getAndMeasurehBUhpc(int i, int i2, int i3, long j);

    /* renamed from: getPlaceables-3p2s80s, reason: not valid java name */
    public List m1104getPlaceables3p2s80s(LazyLayoutMeasureScopeImpl lazyLayoutMeasureScopeImpl, int i, long j) {
        MutableIntObjectMap mutableIntObjectMap = (MutableIntObjectMap) this.data;
        List list = (List) mutableIntObjectMap.get(i);
        if (list != null) {
            return list;
        }
        List compose = lazyLayoutMeasureScopeImpl.compose(i);
        int size = compose.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((Measurable) compose.get(i2)).mo833measureBRTryo0(j));
        }
        mutableIntObjectMap.set(i, arrayList);
        return arrayList;
    }

    public void offer(Poolable poolable) {
        ArrayDeque arrayDeque = (ArrayDeque) this.data;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(poolable);
        }
    }

    public void processEdge(int i, Object obj, GapGroupSourceInformation gapGroupSourceInformation, Object obj2) {
        if (Intrinsics.areEqual(obj, Composer.Companion.Empty)) {
            appendTraceFrame(i, gapGroupSourceInformation, null);
        }
    }

    public void unlock() {
        ((ReentrantReadWriteLock) this.data).writeLock().unlock();
    }

    public Credential(MediaCodecInfo mediaCodecInfo, String str) {
        mediaCodecInfo.getClass();
        str.getClass();
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            capabilitiesForType.getClass();
            this.data = capabilitiesForType;
        } catch (RuntimeException e) {
            throw new InvalidConfigException("Unable to get CodecCapabilities for mime: ".concat(str), e);
        }
    }

    public Credential(Bundle bundle, String str) {
        str.getClass();
        bundle.getClass();
        this.data = bundle;
    }

    public /* synthetic */ Credential(Object obj) {
        this.data = obj;
    }
}
