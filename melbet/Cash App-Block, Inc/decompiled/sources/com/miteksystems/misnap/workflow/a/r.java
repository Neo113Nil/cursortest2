package com.miteksystems.misnap.workflow.a;

import android.content.Context;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.Mrz;
import com.miteksystems.misnap.nfc.util.NfcDeviceAntennaUtil;
import com.miteksystems.misnap.nfc.util.NfcDocumentUtil;
import com.squareup.cash.R;
import defpackage.Drop$$ExternalSyntheticBUOutline0;

/* loaded from: classes4.dex */
public abstract class r {

    public abstract /* synthetic */ class a {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[MiSnapSettings.Nfc.Advanced.DocType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
            int[] iArr2 = new int[CameraSelector$$ExternalSyntheticOutline0.values(4).length];
            try {
                iArr2[0] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[1] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[2] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            b = iArr2;
            int[] iArr3 = new int[NfcDeviceAntennaUtil.Location.values().length];
            try {
                iArr3[NfcDeviceAntennaUtil.Location.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[NfcDeviceAntennaUtil.Location.MIDDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[NfcDeviceAntennaUtil.Location.BOTTOM.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[NfcDeviceAntennaUtil.Location.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[NfcDeviceAntennaUtil.Location.UNAVAILABLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            c = iArr3;
        }
    }

    public static final int a(Context context, MiSnapSettings.Nfc.Advanced.DocType docType, Mrz mrz, int i) {
        context.getClass();
        docType.getClass();
        mrz.getClass();
        if (i == 0) {
            throw null;
        }
        NfcDocumentUtil.ChipLocation nfcDocumentChipLocation = NfcDocumentUtil.getNfcDocumentChipLocation(context, mrz);
        NfcDeviceAntennaUtil.Location nfcAntennaLocation = NfcDeviceAntennaUtil.getNfcAntennaLocation(context);
        int i2 = a.b[CameraSelector$$ExternalSyntheticOutline0.ordinal(i)];
        if (i2 == 1) {
            int i3 = a.a[docType.ordinal()];
            if (i3 == 1) {
                return d(nfcDocumentChipLocation, nfcAntennaLocation);
            }
            if (i3 == 2) {
                int i4 = a.c[nfcAntennaLocation.ordinal()];
                if (i4 == 1) {
                    return R.drawable.misnap_nfc_animated_searching_id_device_top;
                }
                if (i4 == 2) {
                    return R.drawable.misnap_nfc_animated_searching_id_device_middle;
                }
                if (i4 == 3) {
                    return R.drawable.misnap_nfc_animated_searching_id_device_bottom;
                }
                if (i4 == 4) {
                    return R.drawable.misnap_nfc_animated_searching_id_device_unknown;
                }
                if (i4 != 5) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
            } else {
                if (i3 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                int i5 = a.c[nfcAntennaLocation.ordinal()];
                if (i5 == 1) {
                    return R.drawable.misnap_nfc_animated_searching_dl_device_top;
                }
                if (i5 == 2) {
                    return R.drawable.misnap_nfc_animated_searching_dl_device_middle;
                }
                if (i5 == 3) {
                    return R.drawable.misnap_nfc_animated_searching_dl_device_bottom;
                }
                if (i5 == 4) {
                    return R.drawable.misnap_nfc_animated_searching_dl_device_unknown;
                }
                if (i5 != 5) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
            }
        } else if (i2 == 2) {
            int i6 = a.a[docType.ordinal()];
            if (i6 == 1) {
                return c(nfcDocumentChipLocation, nfcAntennaLocation);
            }
            if (i6 == 2) {
                int i7 = a.c[nfcAntennaLocation.ordinal()];
                if (i7 == 1) {
                    return R.drawable.misnap_nfc_animated_reading_id_device_top;
                }
                if (i7 == 2) {
                    return R.drawable.misnap_nfc_animated_reading_id_device_middle;
                }
                if (i7 == 3) {
                    return R.drawable.misnap_nfc_animated_reading_id_device_bottom;
                }
                if (i7 == 4) {
                    return R.drawable.misnap_nfc_animated_reading_id_device_unknown;
                }
                if (i7 != 5) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
            } else {
                if (i6 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                int i8 = a.c[nfcAntennaLocation.ordinal()];
                if (i8 == 1) {
                    return R.drawable.misnap_nfc_animated_reading_dl_device_top;
                }
                if (i8 == 2) {
                    return R.drawable.misnap_nfc_animated_reading_dl_device_middle;
                }
                if (i8 == 3) {
                    return R.drawable.misnap_nfc_animated_reading_dl_device_bottom;
                }
                if (i8 == 4) {
                    return R.drawable.misnap_nfc_animated_reading_dl_device_unknown;
                }
                if (i8 != 5) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
            }
        } else if (i2 != 3) {
            int i9 = a.a[docType.ordinal()];
            if (i9 == 1) {
                return a(nfcDocumentChipLocation, nfcAntennaLocation);
            }
            if (i9 == 2) {
                int i10 = a.c[nfcAntennaLocation.ordinal()];
                if (i10 == 1) {
                    return R.drawable.misnap_nfc_animated_failure_id_device_top;
                }
                if (i10 == 2) {
                    return R.drawable.misnap_nfc_animated_failure_id_device_middle;
                }
                if (i10 == 3) {
                    return R.drawable.misnap_nfc_animated_failure_id_device_bottom;
                }
                if (i10 == 4) {
                    return R.drawable.misnap_nfc_animated_failure_id_device_unknown;
                }
                if (i10 != 5) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
            } else {
                if (i9 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                int i11 = a.c[nfcAntennaLocation.ordinal()];
                if (i11 == 1) {
                    return R.drawable.misnap_nfc_animated_failure_dl_device_top;
                }
                if (i11 == 2) {
                    return R.drawable.misnap_nfc_animated_failure_dl_device_middle;
                }
                if (i11 == 3) {
                    return R.drawable.misnap_nfc_animated_failure_dl_device_bottom;
                }
                if (i11 == 4) {
                    return R.drawable.misnap_nfc_animated_failure_dl_device_unknown;
                }
                if (i11 != 5) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
            }
        } else {
            int i12 = a.a[docType.ordinal()];
            if (i12 == 1) {
                return e(nfcDocumentChipLocation, nfcAntennaLocation);
            }
            if (i12 == 2) {
                int i13 = a.c[nfcAntennaLocation.ordinal()];
                if (i13 == 1) {
                    return R.drawable.misnap_nfc_animated_success_id_device_top;
                }
                if (i13 == 2) {
                    return R.drawable.misnap_nfc_animated_success_id_device_middle;
                }
                if (i13 == 3) {
                    return R.drawable.misnap_nfc_animated_success_id_device_bottom;
                }
                if (i13 == 4) {
                    return R.drawable.misnap_nfc_animated_success_id_device_unknown;
                }
                if (i13 != 5) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
            } else {
                if (i12 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
                int i14 = a.c[nfcAntennaLocation.ordinal()];
                if (i14 == 1) {
                    return R.drawable.misnap_nfc_animated_success_dl_device_top;
                }
                if (i14 == 2) {
                    return R.drawable.misnap_nfc_animated_success_dl_device_middle;
                }
                if (i14 == 3) {
                    return R.drawable.misnap_nfc_animated_success_dl_device_bottom;
                }
                if (i14 == 4) {
                    return R.drawable.misnap_nfc_animated_success_dl_device_unknown;
                }
                if (i14 != 5) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return 0;
                }
            }
        }
        return 0;
    }

    public static int b(NfcDocumentUtil.ChipLocation chipLocation, NfcDeviceAntennaUtil.Location location) {
        if (chipLocation == NfcDocumentUtil.ChipLocation.FRONT && location == NfcDeviceAntennaUtil.Location.TOP) {
            return R.string.misnapWorkflowNfcReaderFragmentSearchInstructionsPassportFrontDeviceTopMessage;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.FRONT && location == NfcDeviceAntennaUtil.Location.MIDDLE) {
            return R.string.misnapWorkflowNfcReaderFragmentSearchInstructionsPassportFrontDeviceMiddleMessage;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.FRONT && location == NfcDeviceAntennaUtil.Location.BOTTOM) {
            return R.string.misnapWorkflowNfcReaderFragmentSearchInstructionsPassportFrontDeviceBottomMessage;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.FRONT && location == NfcDeviceAntennaUtil.Location.UNKNOWN) {
            return R.string.misnapWorkflowNfcReaderFragmentSearchInstructionsPassportFrontDeviceUnknownMessage;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.BACK && location == NfcDeviceAntennaUtil.Location.TOP) {
            return R.string.misnapWorkflowNfcReaderFragmentSearchInstructionsPassportBackDeviceTopMessage;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.BACK && location == NfcDeviceAntennaUtil.Location.MIDDLE) {
            return R.string.misnapWorkflowNfcReaderFragmentSearchInstructionsPassportBackDeviceMiddleMessage;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.BACK && location == NfcDeviceAntennaUtil.Location.BOTTOM) {
            return R.string.misnapWorkflowNfcReaderFragmentSearchInstructionsPassportBackDeviceBottomMessage;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.BACK && location == NfcDeviceAntennaUtil.Location.UNKNOWN) {
            return R.string.misnapWorkflowNfcReaderFragmentSearchInstructionsPassportBackDeviceUnknownMessage;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.UNKNOWN) {
            return R.string.misnapWorkflowNfcReaderFragmentSearchInstructionsPassportUnknownMessage;
        }
        return 0;
    }

    public static int c(NfcDocumentUtil.ChipLocation chipLocation, NfcDeviceAntennaUtil.Location location) {
        if (chipLocation == NfcDocumentUtil.ChipLocation.FRONT && location == NfcDeviceAntennaUtil.Location.TOP) {
            return R.drawable.misnap_nfc_animated_reading_passport_biopage_device_top;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.FRONT && location == NfcDeviceAntennaUtil.Location.MIDDLE) {
            return R.drawable.misnap_nfc_animated_reading_passport_biopage_device_middle;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.FRONT && location == NfcDeviceAntennaUtil.Location.BOTTOM) {
            return R.drawable.misnap_nfc_animated_reading_passport_biopage_device_bottom;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.FRONT && location == NfcDeviceAntennaUtil.Location.UNKNOWN) {
            return R.drawable.misnap_nfc_animated_reading_passport_biopage_device_unknown;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.BACK && location == NfcDeviceAntennaUtil.Location.TOP) {
            return R.drawable.misnap_nfc_animated_reading_passport_back_cover_device_top;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.BACK && location == NfcDeviceAntennaUtil.Location.MIDDLE) {
            return R.drawable.misnap_nfc_animated_reading_passport_back_cover_device_middle;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.BACK && location == NfcDeviceAntennaUtil.Location.BOTTOM) {
            return R.drawable.misnap_nfc_animated_reading_passport_back_cover_device_bottom;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.BACK && location == NfcDeviceAntennaUtil.Location.UNKNOWN) {
            return R.drawable.misnap_nfc_animated_reading_passport_back_cover_device_unknown;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.UNKNOWN) {
            return R.drawable.misnap_nfc_animated_reading_passport_unknown;
        }
        return 0;
    }

    public static int d(NfcDocumentUtil.ChipLocation chipLocation, NfcDeviceAntennaUtil.Location location) {
        if (chipLocation == NfcDocumentUtil.ChipLocation.FRONT && location == NfcDeviceAntennaUtil.Location.TOP) {
            return R.drawable.misnap_nfc_animated_searching_passport_biopage_device_top;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.FRONT && location == NfcDeviceAntennaUtil.Location.MIDDLE) {
            return R.drawable.misnap_nfc_animated_searching_passport_biopage_device_middle;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.FRONT && location == NfcDeviceAntennaUtil.Location.BOTTOM) {
            return R.drawable.misnap_nfc_animated_searching_passport_biopage_device_bottom;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.FRONT && location == NfcDeviceAntennaUtil.Location.UNKNOWN) {
            return R.drawable.misnap_nfc_animated_searching_passport_biopage_device_unknown;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.BACK && location == NfcDeviceAntennaUtil.Location.TOP) {
            return R.drawable.misnap_nfc_animated_searching_passport_back_cover_device_top;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.BACK && location == NfcDeviceAntennaUtil.Location.MIDDLE) {
            return R.drawable.misnap_nfc_animated_searching_passport_back_cover_device_middle;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.BACK && location == NfcDeviceAntennaUtil.Location.BOTTOM) {
            return R.drawable.misnap_nfc_animated_searching_passport_back_cover_device_bottom;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.BACK && location == NfcDeviceAntennaUtil.Location.UNKNOWN) {
            return R.drawable.misnap_nfc_animated_searching_passport_back_cover_device_unknown;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.UNKNOWN) {
            return R.drawable.misnap_nfc_animated_searching_passport_unknown;
        }
        return 0;
    }

    public static int e(NfcDocumentUtil.ChipLocation chipLocation, NfcDeviceAntennaUtil.Location location) {
        if (chipLocation == NfcDocumentUtil.ChipLocation.FRONT && location == NfcDeviceAntennaUtil.Location.TOP) {
            return R.drawable.misnap_nfc_animated_success_passport_biopage_device_top;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.FRONT && location == NfcDeviceAntennaUtil.Location.MIDDLE) {
            return R.drawable.misnap_nfc_animated_success_passport_biopage_device_middle;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.FRONT && location == NfcDeviceAntennaUtil.Location.BOTTOM) {
            return R.drawable.misnap_nfc_animated_success_passport_biopage_device_bottom;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.FRONT && location == NfcDeviceAntennaUtil.Location.UNKNOWN) {
            return R.drawable.misnap_nfc_animated_success_passport_biopage_device_unknown;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.BACK && location == NfcDeviceAntennaUtil.Location.TOP) {
            return R.drawable.misnap_nfc_animated_success_passport_back_cover_device_top;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.BACK && location == NfcDeviceAntennaUtil.Location.MIDDLE) {
            return R.drawable.misnap_nfc_animated_success_passport_back_cover_device_middle;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.BACK && location == NfcDeviceAntennaUtil.Location.BOTTOM) {
            return R.drawable.misnap_nfc_animated_success_passport_back_cover_device_bottom;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.BACK && location == NfcDeviceAntennaUtil.Location.UNKNOWN) {
            return R.drawable.misnap_nfc_animated_success_passport_back_cover_device_unknown;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.UNKNOWN) {
            return R.drawable.misnap_nfc_animated_success_passport_unknown;
        }
        return 0;
    }

    public static int a(NfcDocumentUtil.ChipLocation chipLocation, NfcDeviceAntennaUtil.Location location) {
        if (chipLocation == NfcDocumentUtil.ChipLocation.FRONT && location == NfcDeviceAntennaUtil.Location.TOP) {
            return R.drawable.misnap_nfc_animated_failure_passport_biopage_device_top;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.FRONT && location == NfcDeviceAntennaUtil.Location.MIDDLE) {
            return R.drawable.misnap_nfc_animated_failure_passport_biopage_device_middle;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.FRONT && location == NfcDeviceAntennaUtil.Location.BOTTOM) {
            return R.drawable.misnap_nfc_animated_failure_passport_biopage_device_bottom;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.FRONT && location == NfcDeviceAntennaUtil.Location.UNKNOWN) {
            return R.drawable.misnap_nfc_animated_failure_passport_biopage_device_unknown;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.BACK && location == NfcDeviceAntennaUtil.Location.TOP) {
            return R.drawable.misnap_nfc_animated_failure_passport_back_cover_device_top;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.BACK && location == NfcDeviceAntennaUtil.Location.MIDDLE) {
            return R.drawable.misnap_nfc_animated_failure_passport_back_cover_device_middle;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.BACK && location == NfcDeviceAntennaUtil.Location.BOTTOM) {
            return R.drawable.misnap_nfc_animated_failure_passport_back_cover_device_bottom;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.BACK && location == NfcDeviceAntennaUtil.Location.UNKNOWN) {
            return R.drawable.misnap_nfc_animated_failure_passport_back_cover_device_unknown;
        }
        if (chipLocation == NfcDocumentUtil.ChipLocation.UNKNOWN) {
            return R.drawable.misnap_nfc_animated_failure_passport_unknown;
        }
        return 0;
    }

    public static final int a(Context context, MiSnapSettings.Nfc.Advanced.DocType docType, Mrz mrz) {
        context.getClass();
        mrz.getClass();
        NfcDocumentUtil.ChipLocation nfcDocumentChipLocation = NfcDocumentUtil.getNfcDocumentChipLocation(context, mrz);
        NfcDeviceAntennaUtil.Location nfcAntennaLocation = NfcDeviceAntennaUtil.getNfcAntennaLocation(context);
        int i = a.a[docType.ordinal()];
        if (i == 1) {
            return b(nfcDocumentChipLocation, nfcAntennaLocation);
        }
        if (i == 2) {
            int i2 = a.c[nfcAntennaLocation.ordinal()];
            if (i2 == 1) {
                return R.string.misnapWorkflowNfcReaderFragmentSearchInstructionsIdDeviceTopMessage;
            }
            if (i2 == 2) {
                return R.string.misnapWorkflowNfcReaderFragmentSearchInstructionsIdDeviceMiddleMessage;
            }
            if (i2 == 3) {
                return R.string.misnapWorkflowNfcReaderFragmentSearchInstructionsIdDeviceBottomMessage;
            }
            if (i2 == 4) {
                return R.string.misnapWorkflowNfcReaderFragmentSearchInstructionsIdDeviceUnknownMessage;
            }
        } else if (i == 3) {
            int i3 = a.c[nfcAntennaLocation.ordinal()];
            if (i3 == 1) {
                return R.string.misnapWorkflowNfcReaderFragmentSearchInstructionsDlDeviceTopMessage;
            }
            if (i3 == 2) {
                return R.string.misnapWorkflowNfcReaderFragmentSearchInstructionsDlDeviceMiddleMessage;
            }
            if (i3 == 3) {
                return R.string.misnapWorkflowNfcReaderFragmentSearchInstructionsDlDeviceBottomMessage;
            }
            if (i3 == 4) {
                return R.string.misnapWorkflowNfcReaderFragmentSearchInstructionsDlDeviceUnknownMessage;
            }
        } else {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return 0;
        }
        return 0;
    }
}
