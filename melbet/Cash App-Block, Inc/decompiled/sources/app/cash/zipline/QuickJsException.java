package app.cash.zipline;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u0000 \b2\u00060\u0001j\u0002`\u0002:\u0001\bB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lapp/cash/zipline/QuickJsException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "detailMessage", "", "jsStackTrace", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "zipline_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QuickJsException extends RuntimeException {
    private static final String STACK_TRACE_CLASS_NAME = "JavaScript";
    private static final Companion Companion = new Companion();
    private static final Pattern STACK_TRACE_PATTERN = Pattern.compile("\\s*at ([^\\s]+) \\(([^\\s]+(?<!cpp))[:(\\d+)]?\\).*$");

    public final class Companion {
        public static void addJavaScriptStack(Throwable th, String str) {
            List list;
            int i;
            StackTraceElement stackTraceElement;
            th.getClass();
            str.getClass();
            List split$default = StringsKt.split$default(str, new char[]{'\n'}, 6);
            if (!split$default.isEmpty()) {
                ListIterator listIterator = split$default.listIterator(split$default.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        list = CollectionsKt.take(split$default, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            list = EmptyList.INSTANCE;
            if (list.isEmpty()) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            StackTraceElement[] stackTrace = th.getStackTrace();
            stackTrace.getClass();
            boolean z = false;
            for (StackTraceElement stackTraceElement2 : stackTrace) {
                if (!z && stackTraceElement2.isNativeMethod() && (Intrinsics.areEqual(stackTraceElement2.getClassName(), QuickJs.class.getName()) || Intrinsics.areEqual(stackTraceElement2.getClassName(), JniCallChannel.class.getName()))) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        Matcher matcher = QuickJsException.STACK_TRACE_PATTERN.matcher((String) it.next());
                        if (matcher.matches()) {
                            String group = matcher.group(1);
                            String group2 = matcher.group(2);
                            if (matcher.groupCount() > 3) {
                                String group3 = matcher.group(3);
                                group3.getClass();
                                i = Integer.parseInt(group3);
                            } else {
                                i = -1;
                            }
                            stackTraceElement = new StackTraceElement(QuickJsException.STACK_TRACE_CLASS_NAME, group, group2, i);
                        } else {
                            stackTraceElement = null;
                        }
                        if (stackTraceElement != null) {
                            arrayList.add(stackTraceElement);
                        }
                    }
                    z = true;
                }
                arrayList.add(stackTraceElement2);
            }
            th.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickJsException(String str, String str2) {
        super(str);
        str.getClass();
        if (str2 != null) {
            Companion.getClass();
            Companion.addJavaScriptStack(this, str2);
        }
    }

    public static final /* synthetic */ void addJavaScriptStack(Throwable th, String str) {
        Companion.getClass();
        Companion.addJavaScriptStack(th, str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public QuickJsException(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
        str.getClass();
    }

    public /* synthetic */ QuickJsException(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
