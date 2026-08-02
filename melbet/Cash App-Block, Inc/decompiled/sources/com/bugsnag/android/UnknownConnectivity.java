package com.bugsnag.android;

import com.bugsnag.android.internal.ImmutableConfig;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptySet;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes4.dex */
public final class UnknownConnectivity implements Connectivity {
    public static final UnknownConnectivity INSTANCE = new UnknownConnectivity();

    public static long findTimestampInFilename(File file) {
        file.getClass();
        String name = file.getName();
        name.getClass();
        int lastIndexOf$default = StringsKt.lastIndexOf$default(name, ".", 0, 6);
        if (lastIndexOf$default != -1) {
            name = name.substring(0, lastIndexOf$default);
        }
        Long longOrNull = StringsKt.toLongOrNull(10, StringsKt.substringBefore(name, "_", "-1"));
        if (longOrNull != null) {
            return longOrNull.longValue();
        }
        return -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static EventFilenameInfo fromEvent$default(Object obj, String str, ImmutableConfig immutableConfig) {
        String str2;
        String uuid = UUID.randomUUID().toString();
        long currentTimeMillis = System.currentTimeMillis();
        boolean z = obj instanceof Event;
        if (z) {
            str = ((Event) obj).impl.apiKey;
        } else if (str == null || str.length() == 0) {
            str = immutableConfig.apiKey;
        }
        String str3 = str;
        if (z) {
            AppWithState appWithState = ((Event) obj).impl.f940app;
            if (appWithState == null) {
                Intrinsics.throwUninitializedPropertyAccessException("app");
                throw null;
            }
            if (Intrinsics.areEqual(appWithState.isLaunching, Boolean.TRUE)) {
                str2 = "startupcrash";
                return new EventFilenameInfo(str3, uuid, currentTimeMillis, str2, !z ? ((Event) obj).impl.getErrorTypesFromStackframes$bugsnag_android_core_release() : SetsKt__SetsJVMKt.setOf(ErrorType.C));
            }
        }
        str2 = "";
        return new EventFilenameInfo(str3, uuid, currentTimeMillis, str2, !z ? ((Event) obj).impl.getErrorTypesFromStackframes$bugsnag_android_core_release() : SetsKt__SetsJVMKt.setOf(ErrorType.C));
    }

    public static EventFilenameInfo fromFile(File file, ImmutableConfig immutableConfig) {
        Set set;
        List split$default;
        String removeSuffix = StringsKt.removeSuffix(file.getName(), "_startupcrash.json");
        int indexOf$default = StringsKt.indexOf$default((CharSequence) removeSuffix, "_", 0, false, 6) + 1;
        int indexOf$default2 = StringsKt.indexOf$default((CharSequence) removeSuffix, "_", indexOf$default, false, 4);
        String substring = (indexOf$default == 0 || indexOf$default2 == -1 || indexOf$default2 <= indexOf$default) ? null : removeSuffix.substring(indexOf$default, indexOf$default2);
        if (substring == null) {
            substring = immutableConfig.apiKey;
        }
        long findTimestampInFilename = findTimestampInFilename(file);
        String name = file.getName();
        name.getClass();
        int lastIndexOf$default = StringsKt.lastIndexOf$default(name, ".", 0, 6);
        if (lastIndexOf$default != -1) {
            name = name.substring(0, lastIndexOf$default);
        }
        String substring2 = name.substring(StringsKt.lastIndexOf$default(name, "_", 0, 6) + 1);
        if (!(substring2.equals("startupcrash") ? true : substring2.equals("not-jvm"))) {
            substring2 = "";
        }
        String name2 = file.getName();
        int lastIndexOf$default2 = StringsKt.lastIndexOf$default(name2, "_", StringsKt.lastIndexOf$default(name2, "_", 0, 6) - 1, 4);
        int lastIndexOf$default3 = StringsKt.lastIndexOf$default(name2, "_", lastIndexOf$default2 - 1, 4) + 1;
        if (lastIndexOf$default3 < lastIndexOf$default2) {
            split$default = StringsKt__StringsKt.split$default(name2.substring(lastIndexOf$default3, lastIndexOf$default2), new String[]{","}, false, 0, 6, null);
            ErrorType[] values = ErrorType.values();
            ArrayList arrayList = new ArrayList();
            for (ErrorType errorType : values) {
                if (split$default.contains(errorType.getDesc())) {
                    arrayList.add(errorType);
                }
            }
            set = CollectionsKt.toSet(arrayList);
        } else {
            set = EmptySet.INSTANCE;
        }
        return new EventFilenameInfo(substring, "", findTimestampInFilename, substring2, set);
    }

    @Override // com.bugsnag.android.Connectivity
    public boolean hasNetworkConnection() {
        return true;
    }

    @Override // com.bugsnag.android.Connectivity
    public void registerForNetworkChanges() {
    }

    @Override // com.bugsnag.android.Connectivity
    public String retrieveNetworkAccessState() {
        return "unknown";
    }
}
