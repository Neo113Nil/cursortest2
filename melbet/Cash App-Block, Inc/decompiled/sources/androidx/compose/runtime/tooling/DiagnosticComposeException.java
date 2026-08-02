package androidx.compose.runtime.tooling;

import com.plaid.internal.EnumC0170g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt__ReversedViewsKt;
import kotlin.collections.ReversedListReadOnly;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/runtime/tooling/DiagnosticComposeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DiagnosticComposeException extends RuntimeException {
    public final ComposeStackTrace trace;

    public DiagnosticComposeException(ComposeStackTrace composeStackTrace) {
        this.trace = composeStackTrace;
        if (composeStackTrace.hasSourceInformation) {
            return;
        }
        int[] iArr = {EnumC0170g.SDK_ASSET_ICON_CHEVRON_LEFT_DOUBLE_S2_VALUE, EnumC0170g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S1_VALUE, EnumC0170g.SDK_ASSET_ICON_CLEARED_REC_VALUE, EnumC0170g.SDK_ASSET_ICON_CLOCK_VALUE, EnumC0170g.SDK_ASSET_ICON_COMMENT_VALUE, 125, -127, 126665345, 200};
        List list = composeStackTrace.frames;
        int size = list.size();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            ComposeStackTraceFrame composeStackTraceFrame = (ComposeStackTraceFrame) list.get(i);
            if (!ArraysKt___ArraysKt.contains(iArr, composeStackTraceFrame.groupKey)) {
                if (composeStackTraceFrame.groupKey == 100) {
                    int i3 = i + 2;
                    if (i3 < size && ((ComposeStackTraceFrame) list.get(i3)).groupKey == 1000) {
                        break;
                    } else {
                        CollectionsKt__MutableCollectionsKt.removeLastOrNull(arrayList);
                    }
                } else {
                    arrayList.add(composeStackTraceFrame);
                }
            }
            i = i2;
        }
        int size2 = arrayList.size();
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[size2];
        for (int i4 = 0; i4 < size2; i4++) {
            stackTraceElementArr[i4] = new StackTraceElement("$$compose", "m$" + ((ComposeStackTraceFrame) arrayList.get(i4)).groupKey, "SourceFile", 1);
        }
        setStackTrace(stackTraceElementArr);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        ComposeStackTrace composeStackTrace = this.trace;
        if (!composeStackTrace.hasSourceInformation) {
            return "Composition stack when thrown:";
        }
        StringBuilder sb = new StringBuilder("Composition stack when thrown:\n");
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        ReversedListReadOnly asReversed = CollectionsKt__ReversedViewsKt.asReversed(composeStackTrace.frames);
        int size = asReversed.getSize();
        String str = null;
        String str2 = null;
        for (int i = 0; i < size; i++) {
            ComposeStackTraceFrame composeStackTraceFrame = (ComposeStackTraceFrame) asReversed.get(i);
            SourceInformation sourceInformation = composeStackTraceFrame.sourceInfo;
            Integer num = composeStackTraceFrame.groupOffset;
            if (sourceInformation != null) {
                boolean z = sourceInformation.isCall;
                String str3 = sourceInformation.functionName;
                if (str3 == null) {
                    String str4 = z ? "<lambda>" : null;
                    if (str4 != null) {
                        str = str4;
                    } else if (str == null) {
                        str = "<unknown function>";
                    }
                } else {
                    str = str3;
                }
                String str5 = sourceInformation.sourceFile;
                if (str5 != null) {
                    str2 = str5;
                } else if (str2 == null) {
                    str2 = "<unknown file>";
                }
                List list = sourceInformation.locations;
                String str6 = str + '(' + str2 + ':' + ((num == null || num.intValue() >= list.size()) ? "<unknown line>" : String.valueOf(((LocationSourceInformation) list.get(num.intValue())).lineNumber)) + ')';
                if (!z) {
                }
                if (!Intrinsics.areEqual(str3, "rememberCompositionContext") || !Intrinsics.areEqual(sourceInformation.packageHash, "9igjgp")) {
                    createListBuilder.add(str6);
                }
            }
        }
        ReversedListReadOnly asReversed2 = CollectionsKt__ReversedViewsKt.asReversed(CollectionsKt__CollectionsJVMKt.build(createListBuilder));
        int size2 = asReversed2.getSize();
        for (int i2 = 0; i2 < size2; i2++) {
            String str7 = (String) asReversed2.get(i2);
            sb.append("\tat ");
            sb.append(str7);
            sb.append('\n');
        }
        return sb.toString();
    }
}
