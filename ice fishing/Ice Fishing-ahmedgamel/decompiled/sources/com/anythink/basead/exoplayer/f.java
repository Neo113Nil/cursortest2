package com.anythink.basead.exoplayer;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class f implements ab {

    /* renamed from: a, reason: collision with root package name */
    public static final long f7973a = 5000;

    /* renamed from: b, reason: collision with root package name */
    public static final int f7974b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f7975c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7976d = 2;

    /* renamed from: e, reason: collision with root package name */
    protected static final int f7977e = 50;

    /* renamed from: f, reason: collision with root package name */
    private static final String f7978f = "DefaultRenderersFactory";

    /* renamed from: g, reason: collision with root package name */
    private final Context f7979g;

    /* renamed from: h, reason: collision with root package name */
    private final com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.k> f7980h;
    private final int i;

    /* renamed from: j, reason: collision with root package name */
    private final long f7981j;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public f(Context context) {
        this(context, 0);
    }

    private static void a() {
    }

    private static com.anythink.basead.exoplayer.b.f[] b() {
        return new com.anythink.basead.exoplayer.b.f[0];
    }

    @Deprecated
    private f(Context context, com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.k> gVar) {
        this(context, gVar, (byte) 0);
    }

    @Override // com.anythink.basead.exoplayer.ab
    public final y[] a(Handler handler, com.anythink.basead.exoplayer.l.h hVar, com.anythink.basead.exoplayer.b.g gVar, com.anythink.basead.exoplayer.g.f fVar, com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.k> gVar2) {
        int i;
        int i4;
        com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.k> gVar3 = gVar2 == null ? this.f7980h : gVar2;
        ArrayList arrayList = new ArrayList();
        Context context = this.f7979g;
        com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.k> gVar4 = gVar3;
        long j6 = this.f7981j;
        int i6 = this.i;
        arrayList.add(new com.anythink.basead.exoplayer.l.e(context, com.anythink.basead.exoplayer.f.c.f8034a, j6, gVar4, handler, hVar, 50));
        if (i6 != 0) {
            int size = arrayList.size();
            if (i6 == 2) {
                size--;
            }
            try {
                arrayList.add(size, (y) Class.forName("com.anythink.expressad.exoplayer.ext.vp9.LibvpxVideoRenderer").getConstructor(Boolean.TYPE, Long.TYPE, Handler.class, com.anythink.basead.exoplayer.l.h.class, Integer.TYPE).newInstance(Boolean.TRUE, Long.valueOf(j6), handler, hVar, 50));
                Log.i(f7978f, "Loaded LibvpxVideoRenderer.");
            } catch (ClassNotFoundException unused) {
            } catch (Exception e9) {
                throw new RuntimeException("Error instantiating VP9 extension", e9);
            }
        }
        Context context2 = this.f7979g;
        com.anythink.basead.exoplayer.b.f[] fVarArr = new com.anythink.basead.exoplayer.b.f[0];
        int i9 = this.i;
        arrayList.add(new com.anythink.basead.exoplayer.b.o(context2, com.anythink.basead.exoplayer.f.c.f8034a, gVar4, handler, gVar, com.anythink.basead.exoplayer.b.c.a(context2), fVarArr));
        if (i9 != 0) {
            int size2 = arrayList.size();
            if (i9 == 2) {
                size2--;
            }
            try {
                try {
                    i = size2 + 1;
                    try {
                        arrayList.add(size2, (y) Class.forName("com.anythink.expressad.exoplayer.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, com.anythink.basead.exoplayer.b.g.class, com.anythink.basead.exoplayer.b.f[].class).newInstance(handler, gVar, fVarArr));
                        Log.i(f7978f, "Loaded LibopusAudioRenderer.");
                    } catch (ClassNotFoundException unused2) {
                        size2 = i;
                        i = size2;
                        try {
                            i4 = i + 1;
                            try {
                                arrayList.add(i, (y) Class.forName("com.anythink.expressad.exoplayer.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, com.anythink.basead.exoplayer.b.g.class, com.anythink.basead.exoplayer.b.f[].class).newInstance(handler, gVar, fVarArr));
                                Log.i(f7978f, "Loaded LibflacAudioRenderer.");
                            } catch (ClassNotFoundException unused3) {
                                i = i4;
                                i4 = i;
                                arrayList.add(i4, (y) Class.forName("com.anythink.expressad.exoplayer.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, com.anythink.basead.exoplayer.b.g.class, com.anythink.basead.exoplayer.b.f[].class).newInstance(handler, gVar, fVarArr));
                                Log.i(f7978f, "Loaded FfmpegAudioRenderer.");
                                arrayList.add(new com.anythink.basead.exoplayer.g.g(fVar, handler.getLooper()));
                                return (y[]) arrayList.toArray(new y[arrayList.size()]);
                            }
                        } catch (ClassNotFoundException unused4) {
                        }
                        arrayList.add(i4, (y) Class.forName("com.anythink.expressad.exoplayer.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, com.anythink.basead.exoplayer.b.g.class, com.anythink.basead.exoplayer.b.f[].class).newInstance(handler, gVar, fVarArr));
                        Log.i(f7978f, "Loaded FfmpegAudioRenderer.");
                        arrayList.add(new com.anythink.basead.exoplayer.g.g(fVar, handler.getLooper()));
                        return (y[]) arrayList.toArray(new y[arrayList.size()]);
                    }
                } catch (ClassNotFoundException unused5) {
                }
                try {
                    i4 = i + 1;
                    arrayList.add(i, (y) Class.forName("com.anythink.expressad.exoplayer.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, com.anythink.basead.exoplayer.b.g.class, com.anythink.basead.exoplayer.b.f[].class).newInstance(handler, gVar, fVarArr));
                    Log.i(f7978f, "Loaded LibflacAudioRenderer.");
                    try {
                        arrayList.add(i4, (y) Class.forName("com.anythink.expressad.exoplayer.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, com.anythink.basead.exoplayer.b.g.class, com.anythink.basead.exoplayer.b.f[].class).newInstance(handler, gVar, fVarArr));
                        Log.i(f7978f, "Loaded FfmpegAudioRenderer.");
                    } catch (ClassNotFoundException unused6) {
                    } catch (Exception e10) {
                        throw new RuntimeException("Error instantiating FFmpeg extension", e10);
                    }
                } catch (Exception e11) {
                    throw new RuntimeException("Error instantiating FLAC extension", e11);
                }
            } catch (Exception e12) {
                throw new RuntimeException("Error instantiating Opus extension", e12);
            }
        }
        arrayList.add(new com.anythink.basead.exoplayer.g.g(fVar, handler.getLooper()));
        return (y[]) arrayList.toArray(new y[arrayList.size()]);
    }

    public f(Context context, int i) {
        this(context, null, i, f7973a);
    }

    @Deprecated
    private f(Context context, com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.k> gVar, byte b9) {
        this(context, gVar, 0, f7973a);
    }

    public f(Context context, int i, long j6) {
        this(context, null, i, j6);
    }

    @Deprecated
    private f(Context context, com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.k> gVar, int i, long j6) {
        this.f7979g = context;
        this.i = i;
        this.f7981j = j6;
        this.f7980h = gVar;
    }

    private static void a(Context context, com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.k> gVar, long j6, Handler handler, com.anythink.basead.exoplayer.l.h hVar, int i, ArrayList<y> arrayList) {
        arrayList.add(new com.anythink.basead.exoplayer.l.e(context, com.anythink.basead.exoplayer.f.c.f8034a, j6, gVar, handler, hVar, 50));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            arrayList.add(size, (y) Class.forName("com.anythink.expressad.exoplayer.ext.vp9.LibvpxVideoRenderer").getConstructor(Boolean.TYPE, Long.TYPE, Handler.class, com.anythink.basead.exoplayer.l.h.class, Integer.TYPE).newInstance(Boolean.TRUE, Long.valueOf(j6), handler, hVar, 50));
            Log.i(f7978f, "Loaded LibvpxVideoRenderer.");
        } catch (ClassNotFoundException unused) {
        } catch (Exception e9) {
            throw new RuntimeException("Error instantiating VP9 extension", e9);
        }
    }

    private static void a(Context context, com.anythink.basead.exoplayer.d.g<com.anythink.basead.exoplayer.d.k> gVar, com.anythink.basead.exoplayer.b.f[] fVarArr, Handler handler, com.anythink.basead.exoplayer.b.g gVar2, int i, ArrayList<y> arrayList) {
        int i4;
        int i6;
        arrayList.add(new com.anythink.basead.exoplayer.b.o(context, com.anythink.basead.exoplayer.f.c.f8034a, gVar, handler, gVar2, com.anythink.basead.exoplayer.b.c.a(context), fVarArr));
        if (i == 0) {
            return;
        }
        int size = arrayList.size();
        if (i == 2) {
            size--;
        }
        try {
            try {
                i4 = size + 1;
                try {
                    arrayList.add(size, (y) Class.forName("com.anythink.expressad.exoplayer.ext.opus.LibopusAudioRenderer").getConstructor(Handler.class, com.anythink.basead.exoplayer.b.g.class, com.anythink.basead.exoplayer.b.f[].class).newInstance(handler, gVar2, fVarArr));
                    Log.i(f7978f, "Loaded LibopusAudioRenderer.");
                } catch (ClassNotFoundException unused) {
                    size = i4;
                    i4 = size;
                    try {
                        i6 = i4 + 1;
                        try {
                            arrayList.add(i4, (y) Class.forName("com.anythink.expressad.exoplayer.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, com.anythink.basead.exoplayer.b.g.class, com.anythink.basead.exoplayer.b.f[].class).newInstance(handler, gVar2, fVarArr));
                            Log.i(f7978f, "Loaded LibflacAudioRenderer.");
                        } catch (ClassNotFoundException unused2) {
                            i4 = i6;
                            i6 = i4;
                            arrayList.add(i6, (y) Class.forName("com.anythink.expressad.exoplayer.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, com.anythink.basead.exoplayer.b.g.class, com.anythink.basead.exoplayer.b.f[].class).newInstance(handler, gVar2, fVarArr));
                            Log.i(f7978f, "Loaded FfmpegAudioRenderer.");
                        }
                    } catch (ClassNotFoundException unused3) {
                    }
                    arrayList.add(i6, (y) Class.forName("com.anythink.expressad.exoplayer.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, com.anythink.basead.exoplayer.b.g.class, com.anythink.basead.exoplayer.b.f[].class).newInstance(handler, gVar2, fVarArr));
                    Log.i(f7978f, "Loaded FfmpegAudioRenderer.");
                }
            } catch (ClassNotFoundException unused4) {
            }
            try {
                i6 = i4 + 1;
                arrayList.add(i4, (y) Class.forName("com.anythink.expressad.exoplayer.ext.flac.LibflacAudioRenderer").getConstructor(Handler.class, com.anythink.basead.exoplayer.b.g.class, com.anythink.basead.exoplayer.b.f[].class).newInstance(handler, gVar2, fVarArr));
                Log.i(f7978f, "Loaded LibflacAudioRenderer.");
                try {
                    arrayList.add(i6, (y) Class.forName("com.anythink.expressad.exoplayer.ext.ffmpeg.FfmpegAudioRenderer").getConstructor(Handler.class, com.anythink.basead.exoplayer.b.g.class, com.anythink.basead.exoplayer.b.f[].class).newInstance(handler, gVar2, fVarArr));
                    Log.i(f7978f, "Loaded FfmpegAudioRenderer.");
                } catch (ClassNotFoundException unused5) {
                } catch (Exception e9) {
                    throw new RuntimeException("Error instantiating FFmpeg extension", e9);
                }
            } catch (Exception e10) {
                throw new RuntimeException("Error instantiating FLAC extension", e10);
            }
        } catch (Exception e11) {
            throw new RuntimeException("Error instantiating Opus extension", e11);
        }
    }

    private static void a(com.anythink.basead.exoplayer.g.f fVar, Looper looper, ArrayList<y> arrayList) {
        arrayList.add(new com.anythink.basead.exoplayer.g.g(fVar, looper));
    }
}
