package d0;

import c0.C;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: d0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0116f {

    /* renamed from: a, reason: collision with root package name */
    public static final C0115e f1816a;

    /* renamed from: b, reason: collision with root package name */
    public static final C0115e f1817b;

    /* renamed from: c, reason: collision with root package name */
    public static final C0115e f1818c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0115e f1819d;

    /* renamed from: e, reason: collision with root package name */
    public static final C0115e f1820e;

    /* renamed from: f, reason: collision with root package name */
    public static final C0115e f1821f;

    /* renamed from: g, reason: collision with root package name */
    public static final C0115e f1822g;

    /* renamed from: h, reason: collision with root package name */
    public static final C0115e f1823h;

    /* renamed from: i, reason: collision with root package name */
    public static final C0115e f1824i;

    /* renamed from: j, reason: collision with root package name */
    public static final C0115e f1825j;

    /* renamed from: k, reason: collision with root package name */
    public static final List f1826k;

    /* renamed from: l, reason: collision with root package name */
    public static final List f1827l;

    /* renamed from: m, reason: collision with root package name */
    public static final C f1828m;

    /* renamed from: n, reason: collision with root package name */
    public static final Map f1829n;

    static {
        C0115e c0115e = new C0115e("--aot-shared-library-name=", "AOTSharedLibraryName");
        f1816a = c0115e;
        C0115e c0115e2 = new C0115e("--aot-shared-library-name=", "aot-shared-library-name", "io.flutter.embedding.engine.loader.FlutterLoader.", true);
        f1817b = c0115e2;
        C0115e c0115e3 = new C0115e("--flutter-assets-dir=", "FlutterAssetsDir");
        f1818c = c0115e3;
        C0115e c0115e4 = new C0115e("--flutter-assets-dir=", "flutter-assets-dir", "io.flutter.embedding.engine.loader.FlutterLoader.", true);
        f1819d = c0115e4;
        C0115e c0115e5 = new C0115e("--old-gen-heap-size=", "OldGenHeapSize");
        f1820e = c0115e5;
        C0115e c0115e6 = new C0115e("--enable-impeller=", "EnableImpeller");
        C0115e c0115e7 = new C0115e("--impeller-backend=", "ImpellerBackend");
        C0115e c0115e8 = new C0115e("--enable-dart-profiling", "EnableDartProfiling");
        C0115e c0115e9 = new C0115e("--profile-startup", "ProfileStartup");
        C0115e c0115e10 = new C0115e("--trace-startup", "TraceStartup");
        C0115e c0115e11 = new C0115e("--merged-platform-ui-thread", "MergedPlatformUIThread");
        C0115e c0115e12 = new C0115e("--vm-snapshot-data=", "VmSnapshotData");
        f1821f = c0115e12;
        C0115e c0115e13 = new C0115e("--isolate-snapshot-data=", "IsolateSnapshotData");
        f1822g = c0115e13;
        C0115e c0115e14 = new C0115e("--enable-hcpp-and-surface-control", "EnableHcpp");
        C0115e c0115e15 = new C0115e("--enable-flutter-gpu", "EnableFlutterGPU");
        C0115e c0115e16 = new C0115e("--impeller-lazy-shader-mode", "ImpellerLazyShaderInitialization");
        C0115e c0115e17 = new C0115e("--impeller-antialias-lines", "ImpellerAntialiasLines");
        C0115e c0115e18 = new C0115e(0, "--enable-opengl-gpu-tracing", "EnableOpenGLGPUTracing");
        C0115e c0115e19 = new C0115e(0, "--enable-vulkan-gpu-tracing", "EnableVulkanGPUTracing");
        C0115e c0115e20 = new C0115e(0, "--skia-deterministic-rendering", "SkiaDeterministicRendering");
        C0115e c0115e21 = new C0115e(0, "--enable-software-rendering", "EnableSoftwareRendering");
        f1823h = c0115e21;
        C0115e c0115e22 = new C0115e(0, "--use-test-fonts", "UseTestFonts");
        C0115e c0115e23 = new C0115e(0, "--vm-service-port=", "VMServicePort");
        C0115e c0115e24 = new C0115e(0, "--enable-vulkan-validation", "EnableVulkanValidation");
        C0115e c0115e25 = new C0115e(0, "--test-flag", "TestFlag");
        f1824i = c0115e25;
        C0115e c0115e26 = new C0115e(0, "--leak-vm=", "LeakVM");
        f1825j = c0115e26;
        C0115e c0115e27 = new C0115e(0, "--start-paused", "StartPaused");
        C0115e c0115e28 = new C0115e(0, "--disable-service-auth-codes", "DisableServiceAuthCodes");
        C0115e c0115e29 = new C0115e(0, "--endless-trace-buffer", "EndlessTraceBuffer");
        C0115e c0115e30 = new C0115e(0, "--trace-skia", "TraceSkia");
        C0115e c0115e31 = new C0115e(0, "--trace-skia-allowlist=", "TraceSkiaAllowList");
        C0115e c0115e32 = new C0115e(0, "--trace-systrace", "TraceSystrace");
        C0115e c0115e33 = new C0115e(0, "--trace-to-file=", "TraceToFile");
        C0115e c0115e34 = new C0115e(0, "--profile-microtasks", "ProfileMicrotasks");
        C0115e c0115e35 = new C0115e(0, "--dump-skp-on-shader-compilation", "DumpSkpOnShaderCompilation");
        C0115e c0115e36 = new C0115e(0, "--purge-persistent-cache", "PurgePersistentCache");
        C0115e c0115e37 = new C0115e(0, "--verbose-logging", "VerboseLogging");
        C0115e c0115e38 = new C0115e(0, "--dart-flags=", "DartFlags");
        C0115e c0115e39 = new C0115e(0, "--no-enable-merged-platform-ui-thread", "DisableMergedPlatformUIThread");
        List<C0115e> unmodifiableList = Collections.unmodifiableList(Arrays.asList(c0115e23, c0115e22, c0115e21, c0115e20, c0115e, c0115e3, c0115e6, c0115e7, c0115e24, c0115e27, c0115e28, c0115e29, c0115e8, c0115e9, c0115e30, c0115e31, c0115e32, c0115e33, c0115e34, c0115e35, c0115e37, c0115e38, c0115e11, c0115e39, c0115e2, c0115e4, c0115e5, c0115e12, c0115e13, c0115e36, c0115e10, c0115e26, c0115e25, c0115e15, c0115e16, c0115e17, c0115e18, c0115e19, c0115e14));
        f1826k = unmodifiableList;
        f1827l = Collections.unmodifiableList(Arrays.asList(c0115e39));
        C c2 = new C();
        c2.put(c0115e2, c0115e);
        c2.put(c0115e4, c0115e3);
        f1828m = c2;
        HashMap hashMap = new HashMap(unmodifiableList.size());
        HashMap hashMap2 = new HashMap(unmodifiableList.size());
        for (C0115e c0115e40 : unmodifiableList) {
            hashMap.put(c0115e40.f1813a, c0115e40);
            hashMap2.put(c0115e40.f1814b, c0115e40);
        }
        f1829n = Collections.unmodifiableMap(hashMap);
        Collections.unmodifiableMap(hashMap2);
    }

    public static C0115e a(String str) {
        int indexOf = str.indexOf(61);
        if (indexOf != -1) {
            str = str.substring(0, indexOf + 1);
        }
        C0115e c0115e = (C0115e) f1829n.get(str);
        C0115e c0115e2 = (C0115e) f1828m.get(c0115e);
        return c0115e2 != null ? c0115e2 : c0115e;
    }
}
