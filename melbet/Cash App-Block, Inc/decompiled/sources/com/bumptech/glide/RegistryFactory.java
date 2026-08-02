package com.bumptech.glide;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.appcompat.app.LocaleOverlayHelper;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.impl.quirk.Quirks;
import androidx.credentials.CredentialProviderFactory;
import androidx.media3.extractor.mkv.Sniffer;
import androidx.media3.ui.DefaultTrackNameProvider;
import androidx.room.CoroutinesRoom;
import androidx.transition.Transition;
import app.cash.zipline.CallResult;
import coil3.request.OneShotDisposable;
import com.android.volley.toolbox.HurlStack;
import com.bumptech.glide.gifdecoder.StandardGifDecoder;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.ImageHeaderParserUtils;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.ResourceEncoder;
import com.bumptech.glide.load.data.DataRewinderRegistry$1;
import com.bumptech.glide.load.data.InputStreamRewinder;
import com.bumptech.glide.load.engine.Resource;
import com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool;
import com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool;
import com.bumptech.glide.load.model.ByteBufferEncoder;
import com.bumptech.glide.load.model.FileLoader;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.ResourceLoader$UriFactory;
import com.bumptech.glide.load.model.stream.QMediaStoreUriLoader;
import com.bumptech.glide.load.resource.bitmap.BitmapEncoder;
import com.bumptech.glide.load.resource.bitmap.ByteBufferBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.ByteBufferBitmapImageDecoderResourceDecoder;
import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.load.resource.bitmap.ExifInterfaceImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.StreamBitmapDecoder;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder;
import com.bumptech.glide.load.resource.file.FileDecoder;
import com.bumptech.glide.load.resource.gif.ByteBufferGifDecoder;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.load.resource.gif.GifFrameResourceDecoder;
import com.bumptech.glide.load.resource.gif.StreamGifDecoder;
import com.bumptech.glide.load.resource.transcode.UnitTranscoder;
import com.bumptech.glide.util.ByteBufferUtil;
import com.caverock.androidsvg.SVG;
import com.fillr.m1;
import com.fillr.n;
import com.google.android.gms.tasks.zzb;
import com.google.android.gms.time.zzc;
import com.google.android.play.core.appupdate.zzi;
import com.squareup.cash.clientroutes.ClientRoute;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.EmptyList;

/* loaded from: classes4.dex */
public abstract class RegistryFactory {
    public static Registry createAndInitRegistry(Glide glide, ArrayList arrayList) {
        ResourceDecoder byteBufferBitmapDecoder;
        ResourceDecoder streamBitmapDecoder;
        ContentResolver contentResolver;
        Class cls;
        BitmapPool bitmapPool = glide.bitmapPool;
        LruArrayPool lruArrayPool = glide.arrayPool;
        GlideContext glideContext = glide.glideContext;
        Context applicationContext = glideContext.getApplicationContext();
        m1 m1Var = glideContext.experiments;
        Registry registry = new Registry();
        DefaultImageHeaderParser defaultImageHeaderParser = new DefaultImageHeaderParser();
        Quirks quirks = registry.imageHeaderParserRegistry;
        synchronized (quirks) {
            quirks.quirks.add(defaultImageHeaderParser);
        }
        ExifInterfaceImageHeaderParser exifInterfaceImageHeaderParser = new ExifInterfaceImageHeaderParser();
        Quirks quirks2 = registry.imageHeaderParserRegistry;
        synchronized (quirks2) {
            quirks2.quirks.add(exifInterfaceImageHeaderParser);
        }
        Resources resources = applicationContext.getResources();
        ArrayList imageHeaderParsers = registry.getImageHeaderParsers();
        ByteBufferGifDecoder byteBufferGifDecoder = new ByteBufferGifDecoder(applicationContext, imageHeaderParsers, bitmapPool, lruArrayPool);
        VideoDecoder videoDecoder = new VideoDecoder(bitmapPool, new Transition.AnonymousClass1());
        Downsampler downsampler = new Downsampler(registry.getImageHeaderParsers(), resources.getDisplayMetrics(), bitmapPool, lruArrayPool);
        int i = 0;
        if (((Map) m1Var.a).containsKey(LocaleOverlayHelper.class)) {
            streamBitmapDecoder = new ByteBufferBitmapImageDecoderResourceDecoder(1);
            byteBufferBitmapDecoder = new ByteBufferBitmapImageDecoderResourceDecoder(0);
        } else {
            byteBufferBitmapDecoder = new ByteBufferBitmapDecoder(downsampler, i);
            streamBitmapDecoder = new StreamBitmapDecoder(i, downsampler, lruArrayPool);
        }
        final CallResult callResult = new CallResult(imageHeaderParsers, lruArrayPool);
        final int i2 = 0;
        registry.append("Animation", InputStream.class, Drawable.class, new ResourceDecoder(callResult, i2) { // from class: com.bumptech.glide.load.resource.drawable.AnimatedImageDecoder$StreamAnimatedImageDecoder
            public final /* synthetic */ int $r8$classId;
            public final CallResult delegate;

            {
                this.$r8$classId = i2;
                this.delegate = callResult;
            }

            @Override // com.bumptech.glide.load.ResourceDecoder
            public final Resource decode(Object obj, int i3, int i4, Options options) {
                switch (this.$r8$classId) {
                    case 0:
                        return CallResult.decode(ImageDecoder.createSource(ByteBufferUtil.fromStream((InputStream) obj)), i3, i4, options);
                    default:
                        return CallResult.decode(ImageDecoder.createSource((ByteBuffer) obj), i3, i4, options);
                }
            }

            @Override // com.bumptech.glide.load.ResourceDecoder
            public final boolean handles(Object obj, Options options) {
                int i3 = this.$r8$classId;
                CallResult callResult2 = this.delegate;
                switch (i3) {
                    case 0:
                        ImageHeaderParser.ImageType type2 = ImageHeaderParserUtils.getType((ArrayList) callResult2.result, (InputStream) obj, (LruArrayPool) callResult2.serviceNames);
                        if (type2 != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                            if (Build.VERSION.SDK_INT < 31 || type2 != ImageHeaderParser.ImageType.ANIMATED_AVIF) {
                                break;
                            }
                        }
                        break;
                    default:
                        ImageHeaderParser.ImageType type3 = ImageHeaderParserUtils.getType((ArrayList) callResult2.result, (ByteBuffer) obj);
                        if (type3 != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                            if (Build.VERSION.SDK_INT < 31 || type3 != ImageHeaderParser.ImageType.ANIMATED_AVIF) {
                                break;
                            }
                        }
                        break;
                }
                return false;
            }
        });
        final CallResult callResult2 = new CallResult(imageHeaderParsers, lruArrayPool);
        final int i3 = 1;
        registry.append("Animation", ByteBuffer.class, Drawable.class, new ResourceDecoder(callResult2, i3) { // from class: com.bumptech.glide.load.resource.drawable.AnimatedImageDecoder$StreamAnimatedImageDecoder
            public final /* synthetic */ int $r8$classId;
            public final CallResult delegate;

            {
                this.$r8$classId = i3;
                this.delegate = callResult2;
            }

            @Override // com.bumptech.glide.load.ResourceDecoder
            public final Resource decode(Object obj, int i32, int i4, Options options) {
                switch (this.$r8$classId) {
                    case 0:
                        return CallResult.decode(ImageDecoder.createSource(ByteBufferUtil.fromStream((InputStream) obj)), i32, i4, options);
                    default:
                        return CallResult.decode(ImageDecoder.createSource((ByteBuffer) obj), i32, i4, options);
                }
            }

            @Override // com.bumptech.glide.load.ResourceDecoder
            public final boolean handles(Object obj, Options options) {
                int i32 = this.$r8$classId;
                CallResult callResult22 = this.delegate;
                switch (i32) {
                    case 0:
                        ImageHeaderParser.ImageType type2 = ImageHeaderParserUtils.getType((ArrayList) callResult22.result, (InputStream) obj, (LruArrayPool) callResult22.serviceNames);
                        if (type2 != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                            if (Build.VERSION.SDK_INT < 31 || type2 != ImageHeaderParser.ImageType.ANIMATED_AVIF) {
                                break;
                            }
                        }
                        break;
                    default:
                        ImageHeaderParser.ImageType type3 = ImageHeaderParserUtils.getType((ArrayList) callResult22.result, (ByteBuffer) obj);
                        if (type3 != ImageHeaderParser.ImageType.ANIMATED_WEBP) {
                            if (Build.VERSION.SDK_INT < 31 || type3 != ImageHeaderParser.ImageType.ANIMATED_AVIF) {
                                break;
                            }
                        }
                        break;
                }
                return false;
            }
        });
        ResourceDrawableDecoder resourceDrawableDecoder = new ResourceDrawableDecoder(applicationContext);
        BitmapEncoder bitmapEncoder = new BitmapEncoder(lruArrayPool);
        Sniffer sniffer = new Sniffer(9, false, false);
        UnitTranscoder unitTranscoder = new UnitTranscoder(1);
        ContentResolver contentResolver2 = applicationContext.getContentResolver();
        registry.append(ByteBuffer.class, new ByteBufferEncoder(0));
        registry.append(InputStream.class, new OneShotDisposable(lruArrayPool, 6));
        registry.append("Bitmap", ByteBuffer.class, Bitmap.class, byteBufferBitmapDecoder);
        registry.append("Bitmap", InputStream.class, Bitmap.class, streamBitmapDecoder);
        String str = Build.FINGERPRINT;
        if ("robolectric".equals(str)) {
            contentResolver = contentResolver2;
            cls = ParcelFileDescriptor.class;
        } else {
            contentResolver = contentResolver2;
            cls = ParcelFileDescriptor.class;
            registry.append("Bitmap", cls, Bitmap.class, new ByteBufferBitmapDecoder(downsampler, 1));
        }
        registry.append("Bitmap", AssetFileDescriptor.class, Bitmap.class, new VideoDecoder(bitmapPool, new CoroutinesRoom.Companion(19)));
        registry.append("Bitmap", cls, Bitmap.class, videoDecoder);
        ByteBufferEncoder byteBufferEncoder = ByteBufferEncoder.FACTORY;
        registry.append(Bitmap.class, Bitmap.class, byteBufferEncoder);
        registry.append("Bitmap", Bitmap.class, Bitmap.class, new FileDecoder(1));
        registry.append(Bitmap.class, (ResourceEncoder) bitmapEncoder);
        registry.append("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new StreamBitmapDecoder(resources, byteBufferBitmapDecoder));
        registry.append("BitmapDrawable", InputStream.class, BitmapDrawable.class, new StreamBitmapDecoder(resources, streamBitmapDecoder));
        registry.append("BitmapDrawable", cls, BitmapDrawable.class, new StreamBitmapDecoder(resources, videoDecoder));
        registry.append(BitmapDrawable.class, (ResourceEncoder) new CallResult(bitmapPool, bitmapEncoder));
        registry.append("Animation", InputStream.class, GifDrawable.class, new StreamGifDecoder(imageHeaderParsers, byteBufferGifDecoder, lruArrayPool));
        registry.append("Animation", ByteBuffer.class, GifDrawable.class, byteBufferGifDecoder);
        registry.append(GifDrawable.class, (ResourceEncoder) new CoroutinesRoom.Companion(20));
        registry.append(StandardGifDecoder.class, StandardGifDecoder.class, byteBufferEncoder);
        registry.append("Bitmap", StandardGifDecoder.class, Bitmap.class, new GifFrameResourceDecoder(bitmapPool));
        registry.append("legacy_append", Uri.class, Drawable.class, resourceDrawableDecoder);
        registry.append("legacy_append", Uri.class, Bitmap.class, new StreamBitmapDecoder(2, resourceDrawableDecoder, bitmapPool));
        registry.register(new DataRewinderRegistry$1(2));
        registry.append(File.class, ByteBuffer.class, new ByteBufferEncoder(6));
        registry.append(File.class, InputStream.class, new FileLoader.StreamFactory(new ByteBufferEncoder(9)));
        registry.append("legacy_append", File.class, File.class, new FileDecoder(0));
        registry.append(File.class, cls, new FileLoader.StreamFactory(new ByteBufferEncoder(8)));
        registry.append(File.class, File.class, byteBufferEncoder);
        registry.register(new InputStreamRewinder.Factory(lruArrayPool));
        if (!"robolectric".equals(str)) {
            registry.register(new DataRewinderRegistry$1(1));
        }
        CredentialProviderFactory credentialProviderFactory = new CredentialProviderFactory(applicationContext, 2, false);
        int i4 = 3;
        zzi zziVar = new zzi(applicationContext, i4);
        ActionBarPolicy actionBarPolicy = new ActionBarPolicy(applicationContext, i4);
        Class cls2 = Integer.TYPE;
        registry.append(cls2, InputStream.class, credentialProviderFactory);
        registry.append(Integer.class, InputStream.class, credentialProviderFactory);
        registry.append(cls2, AssetFileDescriptor.class, zziVar);
        registry.append(Integer.class, AssetFileDescriptor.class, zziVar);
        registry.append(cls2, Drawable.class, actionBarPolicy);
        registry.append(Integer.class, Drawable.class, actionBarPolicy);
        registry.append(Uri.class, InputStream.class, new CredentialProviderFactory(applicationContext, 3, false));
        registry.append(Uri.class, AssetFileDescriptor.class, new ActionBarPolicy(applicationContext, 4));
        ResourceLoader$UriFactory resourceLoader$UriFactory = new ResourceLoader$UriFactory(resources);
        DefaultTrackNameProvider defaultTrackNameProvider = new DefaultTrackNameProvider(resources, 1);
        int i5 = 5;
        OneShotDisposable oneShotDisposable = new OneShotDisposable(resources, i5);
        registry.append(Integer.class, Uri.class, resourceLoader$UriFactory);
        registry.append(cls2, Uri.class, resourceLoader$UriFactory);
        registry.append(Integer.class, AssetFileDescriptor.class, defaultTrackNameProvider);
        registry.append(cls2, AssetFileDescriptor.class, defaultTrackNameProvider);
        registry.append(Integer.class, InputStream.class, oneShotDisposable);
        registry.append(cls2, InputStream.class, oneShotDisposable);
        registry.append(String.class, InputStream.class, new OneShotDisposable(4));
        registry.append(Uri.class, InputStream.class, new OneShotDisposable(4));
        registry.append(String.class, InputStream.class, new ByteBufferEncoder(13));
        registry.append(String.class, cls, new ByteBufferEncoder(12));
        registry.append(String.class, AssetFileDescriptor.class, new ByteBufferEncoder(11));
        registry.append(Uri.class, InputStream.class, new n.b(applicationContext.getAssets(), 7));
        int i6 = 4;
        registry.append(Uri.class, AssetFileDescriptor.class, new zzb(applicationContext.getAssets(), i6));
        registry.append(Uri.class, InputStream.class, new zzi(applicationContext, i6));
        registry.append(Uri.class, InputStream.class, new ActionBarPolicy(applicationContext, i5));
        registry.append(Uri.class, InputStream.class, new QMediaStoreUriLoader.InputStreamFactory(applicationContext, InputStream.class));
        registry.append(Uri.class, cls, new QMediaStoreUriLoader.InputStreamFactory(applicationContext, cls));
        ContentResolver contentResolver3 = contentResolver;
        registry.append(Uri.class, InputStream.class, new n.b(contentResolver3, 8));
        registry.append(Uri.class, cls, new zzb(contentResolver3, i5));
        registry.append(Uri.class, AssetFileDescriptor.class, new m1(contentResolver3, 10));
        registry.append(Uri.class, InputStream.class, new ByteBufferEncoder(14));
        registry.append(URL.class, InputStream.class, new Transition.AnonymousClass1());
        registry.append(Uri.class, File.class, new zzc(applicationContext, false));
        registry.append(GlideUrl.class, InputStream.class, new OneShotDisposable(7));
        registry.append(byte[].class, ByteBuffer.class, new ByteBufferEncoder(3));
        registry.append(byte[].class, InputStream.class, new ByteBufferEncoder(5));
        registry.append(Uri.class, Uri.class, byteBufferEncoder);
        registry.append(Drawable.class, Drawable.class, byteBufferEncoder);
        registry.append("legacy_append", Drawable.class, Drawable.class, new FileDecoder(2));
        registry.register(Bitmap.class, BitmapDrawable.class, new ResourceLoader$UriFactory(resources));
        registry.register(Bitmap.class, byte[].class, sniffer);
        registry.register(Drawable.class, byte[].class, new SVG(bitmapPool, sniffer, unitTranscoder, false, 15));
        registry.register(GifDrawable.class, byte[].class, unitTranscoder);
        VideoDecoder videoDecoder2 = new VideoDecoder(bitmapPool, new HurlStack(20));
        registry.append("legacy_append", ByteBuffer.class, Bitmap.class, videoDecoder2);
        registry.append("legacy_append", ByteBuffer.class, BitmapDrawable.class, new StreamBitmapDecoder(resources, videoDecoder2));
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            throw Recorder$$ExternalSyntheticOutline2.m(it);
        }
        return registry;
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewListingCreate.deepLinkSpecs;
    }
}
