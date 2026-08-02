package ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.data.model;

import defpackage.c6p0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.p7p0;
import defpackage.w96;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.EmptyList;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/scooters/presentation/ontheway/completion/photo/vehicle_detection/data/model/ScootersVehicleDetectionOnPhotoExperiment;", "Lw96;", "Companion", "a", "b", "VehicleType", "ResizeMode", "p7p0", "ru/yandex/taxi/scooters/presentation/ontheway/completion/photo/vehicle_detection/data/model/a", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ScootersVehicleDetectionOnPhotoExperiment extends w96 {
    public static final p7p0 Companion = new p7p0();
    public static final ScootersVehicleDetectionOnPhotoExperiment d = new ScootersVehicleDetectionOnPhotoExperiment(0);
    public final boolean b;
    public final a c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/yandex/taxi/scooters/presentation/ontheway/completion/photo/vehicle_detection/data/model/ScootersVehicleDetectionOnPhotoExperiment$ResizeMode;", "", "Companion", "ru/yandex/taxi/scooters/presentation/ontheway/completion/photo/vehicle_detection/data/model/f", "RESIZE", "FIT_CENTER", "CENTER_CROP", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class ResizeMode {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ ResizeMode[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final ResizeMode CENTER_CROP;
        public static final f Companion;
        public static final ResizeMode FIT_CENTER;
        public static final ResizeMode RESIZE;

        static {
            ResizeMode resizeMode = new ResizeMode("RESIZE", 0);
            RESIZE = resizeMode;
            ResizeMode resizeMode2 = new ResizeMode("FIT_CENTER", 1);
            FIT_CENTER = resizeMode2;
            ResizeMode resizeMode3 = new ResizeMode("CENTER_CROP", 2);
            CENTER_CROP = resizeMode3;
            ResizeMode[] resizeModeArr = {resizeMode, resizeMode2, resizeMode3};
            $VALUES = resizeModeArr;
            $ENTRIES = kotlin.enums.a.a(resizeModeArr);
            Companion = new f();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c6p0(7));
        }

        public static ResizeMode valueOf(String str) {
            return (ResizeMode) Enum.valueOf(ResizeMode.class, str);
        }

        public static ResizeMode[] values() {
            return (ResizeMode[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/scooters/presentation/ontheway/completion/photo/vehicle_detection/data/model/ScootersVehicleDetectionOnPhotoExperiment$VehicleType;", "", "Companion", "ru/yandex/taxi/scooters/presentation/ontheway/completion/photo/vehicle_detection/data/model/g", "SCOOTER", "BIKE", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
    @gsq0
    public static final class VehicleType {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ VehicleType[] $VALUES;
        private static final i3y $cachedSerializer$delegate;
        public static final VehicleType BIKE;
        public static final g Companion;
        public static final VehicleType SCOOTER;

        static {
            VehicleType vehicleType = new VehicleType("SCOOTER", 0);
            SCOOTER = vehicleType;
            VehicleType vehicleType2 = new VehicleType("BIKE", 1);
            BIKE = vehicleType2;
            VehicleType[] vehicleTypeArr = {vehicleType, vehicleType2};
            $VALUES = vehicleTypeArr;
            $ENTRIES = kotlin.enums.a.a(vehicleTypeArr);
            Companion = new g();
            $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c6p0(8));
        }

        public static VehicleType valueOf(String str) {
            return (VehicleType) Enum.valueOf(VehicleType.class, str);
        }

        public static VehicleType[] values() {
            return (VehicleType[]) $VALUES.clone();
        }
    }

    public ScootersVehicleDetectionOnPhotoExperiment(int i, boolean z, a aVar) {
        this.b = (i & 1) == 0 ? false : z;
        if ((i & 2) != 0) {
            this.c = aVar;
        } else {
            a.Companion.getClass();
            this.c = a.c;
        }
    }

    @Override // defpackage.w96
    /* renamed from: g, reason: from getter */
    public final boolean getC() {
        return this.b;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/scooters/presentation/ontheway/completion/photo/vehicle_detection/data/model/ScootersVehicleDetectionOnPhotoExperiment$a;", "", "Companion", "ru/yandex/taxi/scooters/presentation/ontheway/completion/photo/vehicle_detection/data/model/c", "ru/yandex/taxi/scooters/presentation/ontheway/completion/photo/vehicle_detection/data/model/b", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class a {
        public static final c Companion = new c();
        public static final i3y[] b = {kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new c6p0(3))};
        public static final a c = new a(0);
        public final List a;

        public /* synthetic */ a(int i, List list) {
            if ((i & 1) == 0) {
                this.a = EmptyList.a;
            } else {
                this.a = list;
            }
        }

        public a(int i) {
            this.a = EmptyList.a;
        }

        public a() {
            this(0);
        }
    }

    public ScootersVehicleDetectionOnPhotoExperiment() {
        this(0);
    }

    public ScootersVehicleDetectionOnPhotoExperiment(int i) {
        a.Companion.getClass();
        a aVar = a.c;
        this.b = false;
        this.c = aVar;
    }

    @gsq0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/yandex/taxi/scooters/presentation/ontheway/completion/photo/vehicle_detection/data/model/ScootersVehicleDetectionOnPhotoExperiment$b;", "", "Companion", "ru/yandex/taxi/scooters/presentation/ontheway/completion/photo/vehicle_detection/data/model/d", "ru/yandex/taxi/scooters/presentation/ontheway/completion/photo/vehicle_detection/data/model/e", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class b {
        public static final e Companion = new e();
        public static final i3y[] e;
        public final String a;
        public final List b;
        public final List c;
        public final ResizeMode d;

        static {
            LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
            e = new i3y[]{null, kotlin.a.b(lazyThreadSafetyMode, new c6p0(4)), kotlin.a.b(lazyThreadSafetyMode, new c6p0(5)), kotlin.a.b(lazyThreadSafetyMode, new c6p0(6))};
        }

        public /* synthetic */ b(int i, String str, List list, List list2, ResizeMode resizeMode) {
            this.a = (i & 1) == 0 ? "" : str;
            int i2 = i & 2;
            EmptyList emptyList = EmptyList.a;
            if (i2 == 0) {
                this.b = emptyList;
            } else {
                this.b = list;
            }
            if ((i & 4) == 0) {
                this.c = emptyList;
            } else {
                this.c = list2;
            }
            if ((i & 8) == 0) {
                this.d = ResizeMode.RESIZE;
            } else {
                this.d = resizeMode;
            }
        }

        public b() {
            ResizeMode resizeMode = ResizeMode.RESIZE;
            this.a = "";
            EmptyList emptyList = EmptyList.a;
            this.b = emptyList;
            this.c = emptyList;
            this.d = resizeMode;
        }
    }
}
