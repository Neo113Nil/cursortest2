package androidx.compose.runtime.tooling;

import androidx.collection.MutableIntObjectMap;
import androidx.collection.MutableObjectList;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.GapRememberObserverHolder;
import androidx.compose.runtime.RememberObserverHolder;
import androidx.compose.runtime.composer.gapbuffer.GapAnchor;
import androidx.compose.runtime.composer.gapbuffer.SlotReader;
import androidx.compose.runtime.composer.gapbuffer.SlotTable;
import androidx.compose.runtime.composer.gapbuffer.SlotTableKt;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
import androidx.compose.runtime.internal.Utils_androidKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.collections.EmptyList;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.legacy.math.linearalgebra.Matrix;

/* loaded from: classes3.dex */
public abstract class SourceInformationKt {
    public static final void attachComposeStackTrace(Throwable th, Function0 function0) {
        tryAttachComposeStackTrace(th, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.runtime.tooling.ReaderTraceBuilder, androidx.credentials.Credential] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.compose.runtime.composer.gapbuffer.GapAnchor] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    public static final List buildTrace(SlotWriter slotWriter, Integer num, int i, Integer num2) {
        int i2;
        int groupKey;
        MutableObjectList mutableObjectList;
        if (slotWriter.closed || slotWriter.getSize$runtime() == 0) {
            return EmptyList.INSTANCE;
        }
        ?? readerTraceBuilder = new ReaderTraceBuilder(slotWriter);
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = slotWriter.parent;
            if (i2 < 0) {
                i2 = slotWriter.parent(i, slotWriter.groups);
            }
        }
        if (num == 0) {
            int slotIndex = slotWriter.currentSlot - slotWriter.slotIndex(slotWriter.groupIndexToAddress(i), slotWriter.groups);
            MutableIntObjectMap mutableIntObjectMap = slotWriter.deferredSlotWrites;
            num = Integer.valueOf(slotIndex + ((mutableIntObjectMap == null || (mutableObjectList = (MutableObjectList) mutableIntObjectMap.get(i)) == null) ? 0 : mutableObjectList._size));
        }
        int groupIndexToAddress = slotWriter.groupIndexToAddress(i) * 5;
        int[] iArr = slotWriter.groups;
        if (groupIndexToAddress < iArr.length) {
            groupKey = slotWriter.groupKey(i);
        } else {
            int parent = i2 >= 0 ? slotWriter.parent(i2, iArr) : i2;
            groupKey = slotWriter.groupKey(i2);
            int i3 = i2;
            i2 = parent;
            i = i3;
        }
        while (i >= 0) {
            readerTraceBuilder.processEdge(groupKey, (slotWriter.groups[(slotWriter.groupIndexToAddress(i) * 5) + 1] & PKIFailureInfo.duplicateCertReq) != 0 ? slotWriter.groupObjectKey(i) : Composer.Companion.Empty, slotWriter.sourceInformationOf$runtime(i), num);
            num = slotWriter.anchor(i);
            if (i2 >= 0) {
                int parent2 = slotWriter.parent(i2, slotWriter.groups);
                groupKey = slotWriter.groupKey(i2);
                int i4 = i2;
                i2 = parent2;
                i = i4;
            } else {
                i = i2;
            }
        }
        return (ArrayList) readerTraceBuilder.data;
    }

    public static final Integer findSubcompositionContextGroup(SlotTable slotTable, CompositionContext compositionContext) {
        SlotReader openReader = slotTable.openReader();
        try {
            return findSubcompositionContextGroup$lambda$0$scanGroup(openReader, compositionContext, 0, openReader.groupsSize);
        } finally {
            openReader.close();
        }
    }

    public static final Integer findSubcompositionContextGroup$lambda$0$scanGroup(SlotReader slotReader, CompositionContext compositionContext, int i, int i2) {
        Integer findSubcompositionContextGroup$lambda$0$scanGroup;
        int[] iArr = slotReader.groups;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int i3 = iArr[(i * 5) + 3] + i;
            if (slotReader.hasMark(i) && slotReader.groupKey(i) == 206 && Intrinsics.areEqual(slotReader.objectKey(i, iArr), ComposerKt.reference)) {
                Object groupGet = slotReader.groupGet(i, 0);
                RememberObserverHolder rememberObserverHolder = groupGet instanceof RememberObserverHolder ? (RememberObserverHolder) groupGet : null;
                Object obj = rememberObserverHolder != null ? ((GapRememberObserverHolder) rememberObserverHolder).wrapped : null;
                GapComposer.CompositionContextHolder compositionContextHolder = obj instanceof GapComposer.CompositionContextHolder ? (GapComposer.CompositionContextHolder) obj : null;
                if (compositionContextHolder != null && compositionContextHolder.ref == compositionContext) {
                    return Integer.valueOf(i);
                }
            }
            if (slotReader.containsMark(i) && (findSubcompositionContextGroup$lambda$0$scanGroup = findSubcompositionContextGroup$lambda$0$scanGroup(slotReader, compositionContext, i + 1, i3)) != null) {
                return Integer.valueOf(findSubcompositionContextGroup$lambda$0$scanGroup.intValue());
            }
            i = i3;
        }
    }

    public static final SourceInformation parseSourceInformation(String str) {
        if (str.length() == 0) {
            return null;
        }
        try {
            return parseSourceInformationInternal(str);
        } catch (ParseException e) {
            Utils_androidKt.logError(e.message, e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final SourceInformation parseSourceInformationInternal(String str) {
        String str2;
        boolean z;
        boolean z2;
        EmptyList emptyList;
        boolean z3;
        Integer num;
        String str3;
        String str4;
        boolean z4;
        SourceInfoParserState sourceInfoParserState = new SourceInfoParserState(str);
        char c = '(';
        int i = 1;
        String str5 = null;
        if (sourceInfoParserState.matches('C')) {
            sourceInfoParserState.i++;
            if (sourceInfoParserState.matches('C')) {
                sourceInfoParserState.i++;
                z4 = true;
            } else {
                z4 = false;
            }
            if (sourceInfoParserState.matches('(')) {
                sourceInfoParserState.i++;
                String takeUntil = sourceInfoParserState.takeUntil(")");
                sourceInfoParserState.expect();
                sourceInfoParserState.i++;
                z2 = z4;
                str2 = takeUntil;
                z = true;
            } else {
                z2 = z4;
                z = true;
                str2 = null;
            }
        } else {
            str2 = null;
            z = false;
            z2 = false;
        }
        EmptyList emptyList2 = EmptyList.INSTANCE;
        while (sourceInfoParserState.i < str.length() - i && Character.isLetter(str.charAt(sourceInfoParserState.i)) && str.charAt(sourceInfoParserState.i + i) == c) {
            char charAt = str.charAt(sourceInfoParserState.i);
            int i2 = i;
            if (charAt != 'N') {
                int i3 = sourceInfoParserState.i;
                if (charAt != 'P') {
                    sourceInfoParserState.i = i3 + 2;
                    int i4 = 0;
                    while (true) {
                        if (i4 <= 0 && sourceInfoParserState.matches(')')) {
                            sourceInfoParserState.expect();
                            sourceInfoParserState.i++;
                            i = i2;
                            break;
                        }
                        if (sourceInfoParserState.atEnd()) {
                            sourceInfoParserState.throwParseError("unexpected end");
                            throw null;
                        }
                        if (sourceInfoParserState.matches(c)) {
                            i4++;
                        } else if (sourceInfoParserState.matches(')')) {
                            i4--;
                        }
                        sourceInfoParserState.i++;
                    }
                } else {
                    sourceInfoParserState.i = i3 + 2;
                    ArrayList arrayList = new ArrayList();
                    int i5 = 0;
                    for (char c2 = ')'; !sourceInfoParserState.atEnd() && !sourceInfoParserState.matches(c2); c2 = ')') {
                        if (sourceInfoParserState.matches('!')) {
                            sourceInfoParserState.i++;
                            String takeUntil2 = sourceInfoParserState.takeUntil("!,)");
                            if (takeUntil2.length() != 0) {
                                int parseInt = Integer.parseInt(takeUntil2);
                                int i6 = 0;
                                while (parseInt > 0) {
                                    int size = arrayList.size();
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 >= size) {
                                            arrayList.add(new ParameterSourceInformation(i6, (String) null, 6));
                                            parseInt--;
                                            break;
                                        }
                                        if (((ParameterSourceInformation) arrayList.get(i7)).sortedIndex == i6) {
                                            i6++;
                                            break;
                                        }
                                        i7++;
                                    }
                                }
                            } else {
                                i5 = i2;
                            }
                        } else {
                            int takeIntUntil = sourceInfoParserState.takeIntUntil("!:,)");
                            if (sourceInfoParserState.matches(':')) {
                                sourceInfoParserState.i++;
                                str4 = StringsKt__StringsJVMKt.replaceFirst(sourceInfoParserState.takeUntil("!,)"), "c#", "androidx.compose.", false);
                            } else {
                                str4 = null;
                            }
                            if (i5 != 0) {
                                int i8 = 0;
                                while (i8 < takeIntUntil) {
                                    int size2 = arrayList.size();
                                    int i9 = 0;
                                    while (true) {
                                        if (i9 >= size2) {
                                            arrayList.add(new ParameterSourceInformation(i8, (String) null, 6));
                                            break;
                                        }
                                        if (((ParameterSourceInformation) arrayList.get(i9)).sortedIndex == i8) {
                                            i8++;
                                            break;
                                        }
                                        i9++;
                                    }
                                }
                                i5 = 0;
                            }
                            arrayList.add(new ParameterSourceInformation(takeIntUntil, str4, 2));
                        }
                        if (sourceInfoParserState.matches(',')) {
                            sourceInfoParserState.i++;
                        }
                    }
                    sourceInfoParserState.expect();
                    sourceInfoParserState.i++;
                    emptyList2 = arrayList;
                }
            } else {
                sourceInfoParserState.i += 2;
                ArrayList arrayList2 = new ArrayList();
                while (!sourceInfoParserState.atEnd() && !sourceInfoParserState.matches(')')) {
                    String takeUntil3 = sourceInfoParserState.takeUntil(":,)");
                    if (sourceInfoParserState.matches(':')) {
                        sourceInfoParserState.i++;
                        str3 = StringsKt__StringsJVMKt.replaceFirst(sourceInfoParserState.takeUntil(",)"), "c#", "androidx.compose.", false);
                    } else {
                        str3 = null;
                    }
                    arrayList2.add(new ParameterSourceInformation(arrayList2.size(), takeUntil3, str3));
                    if (sourceInfoParserState.matches(',')) {
                        sourceInfoParserState.i++;
                    }
                }
                sourceInfoParserState.expect();
                sourceInfoParserState.i++;
                emptyList2 = arrayList2;
            }
            i = i2;
            c = '(';
        }
        int i10 = i;
        EmptyList emptyList3 = EmptyList.INSTANCE;
        if (sourceInfoParserState.matches(':')) {
            sourceInfoParserState.i++;
            emptyList = emptyList3;
        } else {
            ArrayList arrayList3 = new ArrayList();
            while (!sourceInfoParserState.atEnd() && !sourceInfoParserState.matches(':')) {
                if (sourceInfoParserState.matches('*')) {
                    sourceInfoParserState.i++;
                    z3 = i10;
                } else {
                    z3 = 0;
                }
                Integer valueOf = !sourceInfoParserState.matches('@') ? Integer.valueOf(sourceInfoParserState.takeIntUntil("@") + 1) : null;
                sourceInfoParserState.i++;
                int takeIntUntil2 = sourceInfoParserState.takeIntUntil("L,:");
                if (sourceInfoParserState.matches(Matrix.MATRIX_TYPE_RANDOM_LT)) {
                    sourceInfoParserState.i++;
                    num = Integer.valueOf(sourceInfoParserState.takeIntUntil(",:"));
                } else {
                    num = null;
                }
                arrayList3.add(new LocationSourceInformation(valueOf != null ? valueOf.intValue() : -1, takeIntUntil2, z3, num != null ? num.intValue() : -1));
                if (sourceInfoParserState.matches(',')) {
                    sourceInfoParserState.i++;
                }
            }
            sourceInfoParserState.i++;
            emptyList = arrayList3;
        }
        EmptyList emptyList4 = emptyList;
        String takeUntil4 = sourceInfoParserState.takeUntil("#");
        String str6 = takeUntil4.length() > 0 ? takeUntil4 : null;
        if (sourceInfoParserState.matches('#')) {
            int i11 = sourceInfoParserState.i + 1;
            sourceInfoParserState.i = i11;
            str5 = str.substring(i11, str.length());
        }
        return new SourceInformation(str2, str6, str5, emptyList2, emptyList4, z, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.runtime.tooling.ReaderTraceBuilder, androidx.credentials.Credential] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList traceForGroup(SlotReader slotReader, int i, Integer num) {
        ?? readerTraceBuilder = new ReaderTraceBuilder(slotReader);
        int parent = slotReader.parent(i);
        GapAnchor anchor = slotReader.anchor(i);
        while (i >= 0) {
            readerTraceBuilder.processEdge(slotReader.groupKey(i), slotReader.hasObjectKey(i) ? slotReader.objectKey(i, slotReader.groups) : Composer.Companion.Empty, slotReader.table.sourceInformationOf(i), num);
            if (parent >= 0) {
                GapAnchor gapAnchor = anchor;
                anchor = slotReader.anchor(parent);
                i = parent;
                parent = slotReader.parent(parent);
                num = gapAnchor;
            } else {
                i = parent;
                num = anchor;
            }
        }
        return (ArrayList) readerTraceBuilder.data;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0050, code lost:
    
        if (r1.isEmpty() == false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean tryAttachComposeStackTrace(Throwable th, Function0 function0) {
        DiagnosticComposeException diagnosticComposeException;
        ComposeStackTrace composeStackTrace;
        th.getClass();
        List suppressed = ProgressionUtilKt.IMPLEMENTATIONS.getSuppressed(th);
        int size = suppressed.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((Throwable) suppressed.get(i)) instanceof DiagnosticComposeException) {
                return false;
            }
        }
        try {
            composeStackTrace = (ComposeStackTrace) function0.invoke();
        } catch (Throwable th2) {
            diagnosticComposeException = th2;
        }
        if (composeStackTrace != null) {
            boolean z2 = composeStackTrace.hasSourceInformation;
            List list = composeStackTrace.frames;
            if (z2) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    if (((ComposeStackTraceFrame) list.get(i2)).sourceInfo != null) {
                        z = true;
                        break;
                    }
                }
            }
            diagnosticComposeException = th2;
            if (diagnosticComposeException != null) {
                ExceptionsKt__ExceptionsKt.addSuppressed(th, diagnosticComposeException);
            }
            return z;
        }
        if (z) {
            composeStackTrace.getClass();
            diagnosticComposeException = new DiagnosticComposeException(composeStackTrace);
        } else {
            diagnosticComposeException = null;
        }
        if (diagnosticComposeException != null) {
        }
        return z;
    }

    public static final List buildTrace(SlotReader slotReader) {
        Object obj;
        boolean z = slotReader.closed;
        int[] iArr = slotReader.groups;
        if (!z && slotReader.groupsSize != 0) {
            ReaderTraceBuilder readerTraceBuilder = new ReaderTraceBuilder(slotReader);
            int i = slotReader.parent;
            Object valueOf = Integer.valueOf(slotReader.currentSlot - SlotTableKt.access$slotAnchor(i, iArr));
            while (i >= 0) {
                if (slotReader.hasObjectKey(i)) {
                    obj = slotReader.objectKey(i, iArr);
                } else {
                    obj = Composer.Companion.Empty;
                }
                readerTraceBuilder.processEdge(slotReader.groupKey(i), obj, slotReader.table.sourceInformationOf(i), valueOf);
                valueOf = slotReader.anchor(i);
                i = slotReader.parent(i);
            }
            return (ArrayList) readerTraceBuilder.data;
        }
        return EmptyList.INSTANCE;
    }
}
