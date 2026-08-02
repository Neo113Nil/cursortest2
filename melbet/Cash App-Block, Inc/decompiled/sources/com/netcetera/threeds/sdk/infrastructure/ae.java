package com.netcetera.threeds.sdk.infrastructure;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.EnumC0170g;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public abstract class ae extends loadFromXML<LinearLayout> {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;
    private static int ConfigParameters;
    private static final int get;
    private static long getParamValue;
    private static int onCompleted;
    private TextView ThreeDS2Service;
    private final ai ThreeDS2ServiceInitializationCallback;
    private TextView ThreeDS2ServiceInstance;
    private final isEmpty cleanup;
    private final jr createTransaction;
    private ImageView getSDKInfo;
    private boolean getSDKVersion;
    private TextView getWarnings;

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        ConfigParameters = 0;
        onCompleted = 1;
        get();
        get = ((Integer) nj.ThreeDS2Service(new Object[]{48}, 256526108, -256526107, 48)).intValue();
        onCompleted = (ConfigParameters + 13) % 128;
    }

    public ae(Context context, jr jrVar, ai aiVar, isEmpty isempty) {
        super(context);
        this.getSDKVersion = true;
        this.createTransaction = jrVar;
        this.ThreeDS2ServiceInitializationCallback = aiVar;
        this.cleanup = isempty;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:4:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void a(short s, int i, byte b, Object[] objArr) {
        int i2;
        int i3 = (b * 3) + 112;
        int i4 = s * 4;
        int i5 = i + 4;
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i4 + 1];
        if (bArr == null) {
            int i6 = i5;
            byte[] bArr3 = bArr;
            int i7 = 0;
            int i8 = i4;
            int i9 = (-i5) + i8;
            int i10 = i6;
            i3 = i9;
            i5 = i10;
            bArr = bArr3;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i11 = i5 + 1;
            int i12 = i3;
            i6 = i11;
            i5 = bArr[i11];
            i7 = i2 + 1;
            bArr3 = bArr;
            i8 = i12;
            int i92 = (-i5) + i8;
            int i102 = i6;
            i3 = i92;
            i5 = i102;
            bArr = bArr3;
            i2 = i7;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i3;
            if (i2 == i4) {
            }
        }
    }

    private static void b(String str, int i, Object[] objArr) {
        char[] cArr;
        if (str != null) {
            $11 = ($10 + 121) % 128;
            cArr = str.toCharArray();
        } else {
            cArr = str;
        }
        onCompleted oncompleted = new onCompleted();
        char[] initialize = onCompleted.initialize(getParamValue ^ (-2776494906517314268L), cArr, i);
        oncompleted.initialize = 4;
        while (true) {
            int i2 = oncompleted.initialize;
            if (i2 >= initialize.length) {
                objArr[0] = new String(initialize, 4, initialize.length - 4);
                return;
            }
            $10 = ($11 + 93) % 128;
            int i3 = i2 - 4;
            oncompleted.ThreeDS2Service = i3;
            try {
                Object[] objArr2 = {Long.valueOf(initialize[i2] ^ initialize[i2 % 4]), Long.valueOf(i3), Long.valueOf(getParamValue)};
                Map map = removeParam.visaSchemeConfiguration;
                Object obj = map.get(-1242395160);
                if (obj == null) {
                    Class cls = (Class) removeParam.initialize(Color.alpha(0) + 48, (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 27780), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2442);
                    Object[] objArr3 = new Object[1];
                    a((short) 0, -1, (byte) 0, objArr3);
                    String str2 = (String) objArr3[0];
                    Class cls2 = Long.TYPE;
                    obj = cls.getMethod(str2, cls2, cls2, cls2);
                    map.put(-1242395160, obj);
                }
                initialize[i2] = ((Character) ((Method) obj).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {oncompleted, oncompleted};
                Object obj2 = map.get(1526822639);
                if (obj2 == null) {
                    obj2 = ((Class) removeParam.initialize(66 - TextUtils.getOffsetAfter("", 0), (char) View.MeasureSpec.makeMeasureSpec(0, 0), 14236 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)))).getMethod("s", Object.class, Object.class);
                    map.put(1526822639, obj2);
                }
                ((Method) obj2).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    public static void get() {
        getParamValue = 1519036664140409024L;
    }

    public static void init$0() {
        $$a = new byte[]{126, 35, -39, 100};
        $$b = 66;
    }

    private static /* synthetic */ Object initialize(Object[] objArr) {
        ae aeVar = (ae) objArr[0];
        Context context = (Context) objArr[1];
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        linearLayout.setGravity(1);
        linearLayout.setOrientation(1);
        int i = es.getSDKVersion;
        int i2 = es.ThreeDS2Service;
        linearLayout.setPadding(i, i2, i, es.initialize);
        LinearLayout linearLayout2 = new LinearLayout(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        linearLayout2.setFocusable(true);
        linearLayout2.setLayoutParams(layoutParams);
        linearLayout2.setGravity(1);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        TextView textView = new TextView(context);
        aeVar.ThreeDS2ServiceInstance = textView;
        textView.setLayoutParams(layoutParams2);
        aeVar.ThreeDS2ServiceInstance.setGravity(8388611);
        TextView textView2 = aeVar.ThreeDS2ServiceInstance;
        int i3 = es.getWarnings;
        textView2.setPadding(0, i3, 0, i3);
        aeVar.ThreeDS2ServiceInstance.setTextColor(-16777216);
        TextView textView3 = aeVar.ThreeDS2ServiceInstance;
        Object[] objArr2 = new Object[1];
        b("盶횱皕ⓦ鸘嬽㽏㟘䄊Ꭰ矐罃ᦳ⯪깻蚽퀙\ue246\ue6f6츥\ua8da뫹\ude8bᦚ捁畠ᔡℍ㯸ඓ䶡楋\uf26e쐀萿냠쨓鲧", (TypedValue.complexToFloat(0) > RecyclerView.DECELERATION_RATE ? 1 : (TypedValue.complexToFloat(0) == RecyclerView.DECELERATION_RATE ? 0 : -1)), objArr2);
        aeVar.getWarnings(textView3, ((String) objArr2[0]).intern());
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout3.setGravity(48);
        linearLayout3.setPadding(0, i2, 0, i2);
        aeVar.getSDKInfo = new ImageView(context);
        int i4 = get;
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i4, i4);
        layoutParams3.bottomMargin = i2;
        layoutParams3.topMargin = i2;
        layoutParams3.rightMargin = i3;
        aeVar.getSDKInfo.setLayoutParams(layoutParams3);
        aeVar.getSDKInfo.setVisibility(8);
        ImageView imageView = aeVar.getSDKInfo;
        Object[] objArr3 = new Object[1];
        b("ᵧ顈ᴄ졤嵯ᗄ폍\uf4af⪛嵙魒밴爢攓䋹䗊뮈겿ੴ\u0d52썋\uf400㈉\udaed࣐㮙念\ue27a偩䍪ꄣ\uaa3c駣諹梤率ꆸ퉛၍㬱\ue919᧕쟒살", View.combineMeasuredStates(0, 0), objArr3);
        aeVar.getWarnings(imageView, ((String) objArr3[0]).intern());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        TextView textView4 = new TextView(context);
        aeVar.getWarnings = textView4;
        textView4.setLayoutParams(layoutParams4);
        aeVar.getWarnings.setGravity(8388611);
        aeVar.getWarnings.setPadding(0, i2, 0, i2);
        aeVar.getWarnings.setTextColor(-16777216);
        TextView textView5 = aeVar.getWarnings;
        Object[] objArr4 = new Object[1];
        b("\ud8de쒲\ud8bd뤢⨹䤾ꊋ菹\uef22ƣ\uea14쭢랛㧩㎿㊜縱\uf045笲稄۲꣺䍏궻쵩杣裥锬闐ᾐ큥\udd6a屚혃᧢ӑ", Drawable.resolveOpacity(0, 0), objArr4);
        aeVar.getWarnings(textView5, ((String) objArr4[0]).intern());
        linearLayout3.addView(aeVar.getSDKInfo);
        linearLayout3.addView(aeVar.getWarnings);
        linearLayout2.addView(aeVar.ThreeDS2ServiceInstance);
        linearLayout2.addView(linearLayout3);
        LinearLayout linearLayout4 = new LinearLayout(context);
        ViewGroup.LayoutParams layoutParams5 = new ViewGroup.LayoutParams(-1, -2);
        linearLayout4.setFocusable(true);
        linearLayout4.setLayoutParams(layoutParams5);
        linearLayout4.setGravity(1);
        linearLayout4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        TextView textView6 = new TextView(context);
        aeVar.ThreeDS2Service = textView6;
        textView6.setLayoutParams(layoutParams6);
        aeVar.ThreeDS2Service.setGravity(8388611);
        aeVar.ThreeDS2Service.setVisibility(8);
        aeVar.ThreeDS2Service.setPadding(0, i2, 0, 0);
        aeVar.ThreeDS2Service.setImportantForAccessibility(1);
        TextView textView7 = aeVar.ThreeDS2Service;
        Object[] objArr5 = new Object[1];
        b("ឣ룈ៀ둻똌㕄꿒ῌ\u205f緙\ue74d块磦䖓㻦꺩녌谿癫\ue631즏풀世ㆎȔᬙ薼ङ媭揪\udd3c䅟錿ꩽᒡ飵ꭏ", View.resolveSize(0, 0), objArr5);
        aeVar.getWarnings(textView7, ((String) objArr5[0]).intern());
        linearLayout4.addView(aeVar.ThreeDS2Service);
        linearLayout.addView(linearLayout2);
        linearLayout.addView(linearLayout4);
        et.bq_(aeVar.ThreeDS2ServiceInstance, aeVar.createTransaction);
        et.bm_(aeVar.getWarnings, aeVar.createTransaction);
        et.bn_(aeVar.ThreeDS2Service, aeVar.createTransaction, 1);
        int i5 = ConfigParameters + 115;
        onCompleted = i5 % 128;
        if (i5 % 2 != 0) {
            return linearLayout;
        }
        throw null;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.writeReplace
    public void ThreeDS2Service(setScroller setscroller) {
        ConfigParameters = (onCompleted + 47) % 128;
        initialize();
        this.ThreeDS2ServiceInstance.setText(setscroller.removeParam());
        ThreeDS2Service(setscroller.configureScheme());
        initialize(setscroller.ConfigurationBuilder());
        initialize(setscroller.visaSchemeConfiguration());
        onCompleted = (ConfigParameters + 125) % 128;
    }

    @Override // com.netcetera.threeds.sdk.infrastructure.loadFromXML
    public /* synthetic */ LinearLayout ThreeDS2ServiceInstance(Context context) {
        ConfigParameters = (onCompleted + 71) % 128;
        LinearLayout linearLayout = (LinearLayout) getWarnings(new Object[]{this, context}, 2035557499, -2035557499, System.identityHashCode(this));
        ConfigParameters = (onCompleted + 65) % 128;
        return linearLayout;
    }

    public void getWarnings(boolean z) {
        int i = ConfigParameters + 11;
        onCompleted = i % 128;
        if (i % 2 != 0) {
            this.getSDKVersion = z;
        } else {
            this.getSDKVersion = z;
            throw null;
        }
    }

    public static /* synthetic */ Object getWarnings(Object[] objArr, int i, int i2, int i3) {
        return initialize(objArr);
    }

    private boolean ThreeDS2ServiceInstance(addSuppressed addsuppressed) {
        if (addSuppressed.ThreeDS2Service == addsuppressed) {
            ConfigParameters = (onCompleted + EnumC0170g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE) % 128;
            return true;
        }
        ConfigParameters = (onCompleted + 41) % 128;
        return false;
    }

    public final void ThreeDS2Service(String str) {
        ConfigParameters = (onCompleted + 85) % 128;
        this.cleanup.aU_(this.getWarnings, str);
        int i = onCompleted + 79;
        ConfigParameters = i % 128;
        if (i % 2 != 0) {
            int i2 = 8 / 0;
        }
    }

    public final void initialize(addSuppressed addsuppressed) {
        if (ThreeDS2ServiceInstance(addsuppressed)) {
            ConfigParameters = (onCompleted + 85) % 128;
            this.getSDKInfo.setVisibility(0);
            this.getSDKInfo.setImageBitmap(this.ThreeDS2ServiceInitializationCallback.ar_());
            onCompleted = (ConfigParameters + 33) % 128;
            return;
        }
        this.getSDKInfo.setVisibility(8);
    }

    private void initialize(String str) {
        TextView textView;
        int i;
        int i2 = onCompleted;
        ConfigParameters = (i2 + 109) % 128;
        if (this.getSDKVersion) {
            int i3 = i2 + 5;
            ConfigParameters = i3 % 128;
            if (i3 % 2 != 0) {
                oj.getWarnings((CharSequence) str);
                throw null;
            }
            if (!oj.getWarnings((CharSequence) str)) {
                int i4 = onCompleted + 109;
                ConfigParameters = i4 % 128;
                int i5 = i4 % 2;
                TextView textView2 = this.ThreeDS2Service;
                if (i5 != 0) {
                    textView2.setText(str);
                    textView = this.ThreeDS2Service;
                    i = 1;
                } else {
                    textView2.setText(str);
                    textView = this.ThreeDS2Service;
                    i = 0;
                }
                textView.setVisibility(i);
                return;
            }
        }
        this.ThreeDS2Service.setVisibility(8);
    }
}
