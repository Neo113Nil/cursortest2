package android.content.Context;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* compiled from: r8-map-id-ad53bc00775cc49f3760de3ef5ee15f0f7d4eb373264baa1785c3fa1a15d54ed */
/* loaded from: classes.dex */
public final class FrostHunterMenuQuantumRogueUltra4943 extends FrostHunterInstrumentationBetaOmegaOlympian3175 {
    public static Long FrostHunterMeteringPointBetaCyber9571(FileTime fileTime) {
        long millis;
        millis = fileTime.toMillis();
        Long valueOf = Long.valueOf(millis);
        if (millis != 0) {
            return valueOf;
        }
        return null;
    }

    @Override // android.content.Context.FrostHunterInstrumentationBetaOmegaOlympian3175, android.content.Context.FrostHunterRemoteModelManagerPrimeStrikePrime5960
    public final FrostHunterContextBetaOmega1136 FrostHunterLightSensorForceFusion4241(FrostHunterCoroutineScopePrimeSpark1417 frostHunterCoroutineScopePrimeSpark1417) {
        Path path;
        FrostHunterCoroutineScopePrimeSpark1417 frostHunterCoroutineScopePrimeSpark14172;
        frostHunterCoroutineScopePrimeSpark1417.getClass();
        path = Paths.get(frostHunterCoroutineScopePrimeSpark1417.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterCameraXTurboCelestialHero5430(), new String[0]);
        path.getClass();
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path readSymbolicLink = readAttributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            if (readSymbolicLink != null) {
                String str = FrostHunterCoroutineScopePrimeSpark1417.FrostHunterFlowMaxDragonHero5809;
                frostHunterCoroutineScopePrimeSpark14172 = FrostHunterServiceInfoEclipseAurora7011.FrostHunterScaleAnimationStrikeSpark5059(readSymbolicLink.toString());
            } else {
                frostHunterCoroutineScopePrimeSpark14172 = null;
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            Long FrostHunterMeteringPointBetaCyber9571 = creationTime != null ? FrostHunterMeteringPointBetaCyber9571(creationTime) : null;
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            Long FrostHunterMeteringPointBetaCyber95712 = lastModifiedTime != null ? FrostHunterMeteringPointBetaCyber9571(lastModifiedTime) : null;
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            return new FrostHunterContextBetaOmega1136(isRegularFile, isDirectory, frostHunterCoroutineScopePrimeSpark14172, valueOf, FrostHunterMeteringPointBetaCyber9571, FrostHunterMeteringPointBetaCyber95712, lastAccessTime != null ? FrostHunterMeteringPointBetaCyber9571(lastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }

    @Override // android.content.Context.FrostHunterInstrumentationBetaOmegaOlympian3175, android.content.Context.FrostHunterRemoteModelManagerPrimeStrikePrime5960
    public final void FrostHunterServiceEliteCelestialThunder1757(FrostHunterCoroutineScopePrimeSpark1417 frostHunterCoroutineScopePrimeSpark1417, FrostHunterCoroutineScopePrimeSpark1417 frostHunterCoroutineScopePrimeSpark14172) {
        Path path;
        Path path2;
        frostHunterCoroutineScopePrimeSpark1417.getClass();
        frostHunterCoroutineScopePrimeSpark14172.getClass();
        try {
            path = Paths.get(frostHunterCoroutineScopePrimeSpark1417.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterCameraXTurboCelestialHero5430(), new String[0]);
            path.getClass();
            path2 = Paths.get(frostHunterCoroutineScopePrimeSpark14172.FrostHunterCameraXPixelTurboCosmos9814.FrostHunterCameraXTurboCelestialHero5430(), new String[0]);
            path2.getClass();
            Files.move(path, path2, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            FrostHunterVibratorSpectraBetaNovaX4683.FrostHunterFragmentBetaMegaVortex6025("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // android.content.Context.FrostHunterInstrumentationBetaOmegaOlympian3175
    public final String toString() {
        return "NioSystemFileSystem";
    }
}
