package com.google.mlkit.vision.text;

import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Parcelable;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatDelegateImpl;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.camera.camera2.pipe.OutputStatus;
import androidx.camera.camera2.pipe.internal.OutputResult;
import androidx.collection.SimpleArrayMap;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.math.MathUtils;
import androidx.lifecycle.SavedStateHandle;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.load.model.ModelLoaderFactory;
import com.bumptech.glide.load.model.MultiModelLoaderFactory;
import com.bumptech.glide.load.model.stream.QMediaStoreUriLoader;
import com.google.android.gms.internal.mlkit_vision_text_common.zzce;
import com.google.android.gms.internal.mlkit_vision_text_common.zzuz;
import com.google.android.gms.internal.mlkit_vision_text_common.zzvf;
import com.google.android.gms.internal.time.zzbq;
import com.google.android.gms.internal.time.zzgv;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.progressindicator.DrawingDelegate$ActiveIndicator;
import com.nimbusds.jose.JWECryptoParts;
import com.nimbusds.jose.jca.JCAContext;
import com.stripe.android.utils.MapUtilsKt;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.crypto.AEADBadTagException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.RandomKt;
import kotlinx.atomicfu.AtomicFU;
import kotlinx.atomicfu.AtomicInt;
import kotlinx.coroutines.CompletableDeferredImpl;

/* loaded from: classes4.dex */
public final class Text {
    public final ArrayList zza;
    public final String zzb;

    public final class Line extends TextBase {
    }

    public final class Symbol extends TextBase {
    }

    public Text(zzvf zzvfVar) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        this.zzb = zzvfVar.zza;
        arrayList.addAll(MapUtilsKt.zza(zzvfVar.zzb, new zza(0)));
    }

    public final class TextBlock extends TextBase {
        public final AbstractList zza;

        public TextBlock(zzuz zzuzVar) {
            super(zzuzVar.zza, zzuzVar.zzb, zzuzVar.zzc, zzuzVar.zzd);
            this.zza = MapUtilsKt.zza(zzuzVar.zze, new zzd(0));
        }

        public TextBlock(String str, Rect rect, List list, String str2, AbstractList abstractList) {
            super(str, rect, list, str2);
            this.zza = abstractList;
        }
    }

    public Text(String str, zzce zzceVar) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        arrayList.addAll(zzceVar);
        this.zzb = str;
    }

    public abstract class TextBase implements ModelLoaderFactory {
        public Object zza;
        public Object zzd;

        public TextBase(String str, Rect rect, List list, String str2) {
            this.zza = str;
            new Rect(rect);
            Point[] pointArr = new Point[list.size()];
            for (int i = 0; i < list.size(); i++) {
                pointArr[i] = new Point((Point) list.get(i));
            }
            this.zzd = str2;
        }

        public static float getFractionInRange(int i, int i2, int i3) {
            return MathUtils.clamp((i - i2) / i3, RecyclerView.DECELERATION_RATE, 1.0f);
        }

        public static byte[] macDataRfc8439(byte[] bArr, ByteBuffer byteBuffer) {
            int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
            int remaining = byteBuffer.remaining();
            int i = remaining % 16;
            int i2 = (i == 0 ? remaining : (remaining + 16) - i) + length;
            ByteBuffer order = ByteBuffer.allocate(i2 + 16).order(ByteOrder.LITTLE_ENDIAN);
            order.put(bArr);
            order.position(length);
            order.put(byteBuffer);
            order.position(i2);
            order.putLong(bArr.length);
            order.putLong(remaining);
            return order.array();
        }

        @Override // com.bumptech.glide.load.model.ModelLoaderFactory
        public ModelLoader build(MultiModelLoaderFactory multiModelLoaderFactory) {
            Context context = (Context) this.zza;
            Class cls = (Class) this.zzd;
            return new QMediaStoreUriLoader(context, multiModelLoaderFactory.build(File.class, cls), multiModelLoaderFactory.build(Uri.class, cls), cls);
        }

        public abstract void cancelAnimatorImmediately();

        public void cleanup() {
            zzbq zzbqVar = (zzbq) this.zza;
            if (zzbqVar != null) {
                try {
                    ((AppCompatDelegateImpl) this.zzd).mContext.unregisterReceiver(zzbqVar);
                } catch (IllegalArgumentException unused) {
                }
                this.zza = null;
            }
        }

        public void clear() {
            SavedStateHandle savedStateHandle = (SavedStateHandle) this.zzd;
            String str = (String) this.zza;
            savedStateHandle.getClass();
            str.getClass();
            JWECryptoParts jWECryptoParts = savedStateHandle.impl;
            jWECryptoParts.getClass();
            ((LinkedHashMap) jWECryptoParts.header).remove(str);
            ((LinkedHashMap) jWECryptoParts.iv).remove(str);
            ((LinkedHashMap) jWECryptoParts.cipherText).remove(str);
            SavedStateHandle.SavingStateLiveData savingStateLiveData = (SavedStateHandle.SavingStateLiveData) savedStateHandle.liveDatas.remove(str);
            if (savingStateLiveData != null) {
                savingStateLiveData.handle = null;
            }
        }

        public abstract IntentFilter createIntentFilterForBroadcastReceiver();

        public void decrement() {
            AtomicInt atomicInt = (AtomicInt) this.zza;
            atomicInt.getClass();
            if (AtomicInt.FU.decrementAndGet(atomicInt) == 0) {
                ((CompletableDeferredImpl) this.zzd).makeCompleting$kotlinx_coroutines_core(new OutputResult(new OutputStatus(2)));
                release();
            }
        }

        public byte[] decrypt(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
            if (byteBuffer.remaining() < 16) {
                a$$ExternalSyntheticBUOutline0.m$6("ciphertext too short");
                return null;
            }
            int position = byteBuffer.position();
            byte[] bArr3 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr3);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            try {
                byte[] bArr4 = new byte[32];
                ((zzgv) this.zzd).chacha20Block(0, bArr).get(bArr4);
                if (!MessageDigest.isEqual(RandomKt.computeMac(bArr4, macDataRfc8439(bArr2, byteBuffer)), bArr3)) {
                    throw new GeneralSecurityException("invalid MAC");
                }
                byteBuffer.position(position);
                zzgv zzgvVar = (zzgv) this.zza;
                zzgvVar.getClass();
                ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
                zzgvVar.process(bArr, allocate, byteBuffer);
                return allocate.array();
            } catch (GeneralSecurityException e) {
                throw new AEADBadTagException(e.toString());
            }
        }

        public void encrypt(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2, byte[] bArr3) {
            if (byteBuffer.remaining() < bArr2.length + 16) {
                a$$ExternalSyntheticBUOutline0.m$3("Given ByteBuffer output is too small");
                return;
            }
            int position = byteBuffer.position();
            zzgv zzgvVar = (zzgv) this.zza;
            zzgvVar.getClass();
            if (byteBuffer.remaining() < bArr2.length) {
                a$$ExternalSyntheticBUOutline0.m$3("Given ByteBuffer output is too small");
                return;
            }
            zzgvVar.process(bArr, byteBuffer, ByteBuffer.wrap(bArr2));
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            ByteBuffer chacha20Block = ((zzgv) this.zzd).chacha20Block(0, bArr);
            byte[] bArr4 = new byte[32];
            chacha20Block.get(bArr4);
            byte[] computeMac = RandomKt.computeMac(bArr4, macDataRfc8439(bArr3, byteBuffer));
            byteBuffer.limit(byteBuffer.limit() + 16);
            byteBuffer.put(computeMac);
        }

        public abstract int[] following(int i);

        public Parcelable get() {
            return (Parcelable) ((SavedStateHandle) this.zzd).get((String) this.zza);
        }

        public MenuItem getMenuItemWrapper(MenuItem menuItem) {
            if (!(menuItem instanceof SupportMenuItem)) {
                return menuItem;
            }
            SupportMenuItem supportMenuItem = (SupportMenuItem) menuItem;
            if (((SimpleArrayMap) this.zzd) == null) {
                this.zzd = new SimpleArrayMap(0);
            }
            MenuItem menuItem2 = (MenuItem) ((SimpleArrayMap) this.zzd).get(supportMenuItem);
            if (menuItem2 != null) {
                return menuItem2;
            }
            MenuItemWrapperICS menuItemWrapperICS = new MenuItemWrapperICS((Context) this.zza, supportMenuItem);
            ((SimpleArrayMap) this.zzd).put(supportMenuItem, menuItemWrapperICS);
            return menuItemWrapperICS;
        }

        public int[] getRange(int i, int i2) {
            if (i < 0 || i2 < 0 || i == i2) {
                return null;
            }
            int[] iArr = (int[]) this.zzd;
            iArr[0] = i;
            iArr[1] = i2;
            return iArr;
        }

        public String getText() {
            String str = (String) this.zza;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("text");
            throw null;
        }

        public void initialize(String str) {
            this.zza = str;
        }

        public abstract void invalidateSpecValues();

        public abstract zzgv newChaCha20Instance(int i, byte[] bArr);

        public abstract void onChange();

        public abstract int[] preceding(int i);

        public abstract void registerAnimatorsCompleteCallback(MaterialCheckBox.AnonymousClass1 anonymousClass1);

        public abstract void release();

        public abstract void requestCancelAnimatorAfterCurrentCycle();

        public void setup() {
            cleanup();
            IntentFilter createIntentFilterForBroadcastReceiver = createIntentFilterForBroadcastReceiver();
            if (createIntentFilterForBroadcastReceiver.countActions() == 0) {
                return;
            }
            if (((zzbq) this.zza) == null) {
                this.zza = new zzbq(this, 1);
            }
            ((AppCompatDelegateImpl) this.zzd).mContext.registerReceiver((zzbq) this.zza, createIntentFilterForBroadcastReceiver);
        }

        public abstract void startAnimator();

        public abstract void unregisterAnimatorsCompleteCallback();

        public TextBase(SavedStateHandle savedStateHandle) {
            savedStateHandle.getClass();
            this.zzd = savedStateHandle;
            this.zza = "PersistedState_".concat(getClass().getName());
        }

        public TextBase(Context context) {
            this.zza = context;
        }

        public TextBase(int i) {
            this.zzd = new ArrayList();
            for (int i2 = 0; i2 < i; i2++) {
                ((ArrayList) this.zzd).add(new DrawingDelegate$ActiveIndicator());
            }
        }

        public TextBase(Set set) {
            this.zzd = new JCAContext(0);
            Objects.requireNonNull(set);
            this.zza = Collections.unmodifiableSet(set);
        }

        public TextBase(int i, boolean z) {
            switch (i) {
                case 4:
                    this.zzd = new int[2];
                    break;
                default:
                    this.zza = AtomicFU.atomic(1);
                    this.zzd = new CompletableDeferredImpl();
                    break;
            }
        }

        public TextBase(Context context, Class cls) {
            this.zza = context;
            this.zzd = cls;
        }

        public TextBase(AppCompatDelegateImpl appCompatDelegateImpl) {
            this.zzd = appCompatDelegateImpl;
        }
    }
}
